/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.Movimiento;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author joshuansu
 */
public class MovimientoDBNGTest {

    public MovimientoDBNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        if (!(new File("Configuracion/configProduction.json")).exists()) {
            new File("Configuracion/config.json").renameTo(new File("Configuracion/configProduction.json"));
            new File("Configuracion/configTest.json").renameTo(new File("Configuracion/config.json"));
        }
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=0;");
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=1;");
            stm.execute("DELETE FROM Movements");
        }
        if (!(new File("Configuracion/configTest.json")).exists()) {
            new File("Configuracion/config.json").renameTo(new File("Configuracion/configTest.json"));
            new File("Configuracion/configProduction.json").renameTo(new File("Configuracion/config.json"));
        }
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getInstance method, of class MovimientoDB.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MovimientoDB instance = MovimientoDB.getInstance();
        assertNotNull(MovimientoDB.getInstance());
        assertEquals(instance, MovimientoDB.getInstance());
    }

    /**
     * Test of saveMovimiento method, of class MovimientoDB.
     */
    @Test
    public void testSaveMovimiento() throws Exception {
        System.out.println("saveMovimiento");
        Movimiento movimiento = new Movimiento();
        movimiento.setAdded_amount(100l);
        movimiento.setTotal(100l);
        movimiento.setRetired_amount(100l);
        movimiento.setProduct_id(1l);

        MovimientoDB.getInstance().saveMovimiento(movimiento);

        Movimiento movimientoFromDB = new Movimiento();
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            try (ResultSet rsSer = stm.executeQuery("SELECT * FROM Movements")) {
                while (rsSer.next()) {
                    movimientoFromDB.setId(rsSer.getLong("id"));
                    movimientoFromDB.setAdded_amount(rsSer.getLong("added_amount"));
                    movimientoFromDB.setRetired_amount(rsSer.getLong("retired_amount"));
                    movimientoFromDB.setProduct_id(rsSer.getLong("product_id"));
                    movimientoFromDB.setTotal(rsSer.getLong("total"));
                }
            }
        }

        assertEquals(movimiento.getAdded_amount(), movimientoFromDB.getAdded_amount());
        assertEquals(movimiento.getRetired_amount(), movimientoFromDB.getRetired_amount());
        assertEquals(movimiento.getProduct_id(), movimientoFromDB.getProduct_id());
        assertEquals(movimiento.getTotal(), movimientoFromDB.getTotal());
    }

    /**
     * Test of saveTablaMovimientos method, of class MovimientoDB.
     */
    @Test(enabled = false)
    public void testSaveTablaMovimientos() throws Exception {
        System.out.println("saveTablaMovimientos");
        ArrayList<Movimiento> movimientos = new ArrayList();

        Movimiento m1 = new Movimiento();
        m1.setAdded_amount(150l);
        m1.setTotal(150l);
        m1.setRetired_amount(150l);
        m1.setProduct_id(2l);

        movimientos.add(m1);

        Movimiento m2 = new Movimiento();
        m2.setAdded_amount(10l);
        m2.setTotal(10l);
        m2.setRetired_amount(5l);
        m2.setProduct_id(1l);

        movimientos.add(m2);

        MovimientoDB.getInstance().saveTablaMovimientos(movimientos);

        ArrayList<Movimiento> movimientosfromDB = new ArrayList();
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            try (ResultSet rsSer = stm.executeQuery("SELECT * FROM Movements")) {
                while (rsSer.next()) {
                    Movimiento movimientoFromDB = new Movimiento();
                    movimientoFromDB.setId(rsSer.getLong("id"));
                    movimientoFromDB.setAdded_amount(rsSer.getLong("added_amount"));
                    movimientoFromDB.setRetired_amount(rsSer.getLong("retired_amount"));
                    movimientoFromDB.setProduct_id(rsSer.getLong("product_id"));
                    movimientoFromDB.setTotal(rsSer.getLong("total"));
                    movimientosfromDB.add(movimientoFromDB);
                }
            }
        }

        assertEquals(3, movimientos.size());
    }

}

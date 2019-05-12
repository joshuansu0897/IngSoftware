/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.Proveedor;
import java.io.File;
import java.sql.Connection;
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
public class ProveedorDBNGTest {

    public ProveedorDBNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        new File("Configuracion/config.json").renameTo(new File("Configuracion/configProduction.json"));
        new File("Configuracion/configTest.json").renameTo(new File("Configuracion/config.json"));
        try (Connection con = ProveedorDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=0;");
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        try (Connection con = ProveedorDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=1;");
            stm.execute("DELETE FROM Proveedor");
        }
        new File("Configuracion/config.json").renameTo(new File("Configuracion/configTest.json"));
        new File("Configuracion/configProduction.json").renameTo(new File("Configuracion/config.json"));
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getInstance method, of class ProveedorDB.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ProveedorDB instance = ProveedorDB.getInstance();
        assertNotNull(ProveedorDB.getInstance());
        assertEquals(instance, ProveedorDB.getInstance());
    }

    /**
     * Test of proveedorExist method, of class ProveedorDB.
     */
    @Test(dependsOnMethods = "testSaveProveedor")
    public void testProveedorExist() throws Exception {
        System.out.println("proveedorExist");
        String name = "name";

        boolean expResult = true;
        boolean result = ProveedorDB.getInstance().proveedorExist(name);
        assertEquals(result, expResult);
    }

    /**
     * Test of saveProveedor method, of class ProveedorDB.
     */
    @Test
    public void testSaveProveedor() throws Exception {
        System.out.println("saveProveedor");
        Proveedor proveedor = new Proveedor();
        proveedor.setName("name");
        proveedor.setDescription("description");
        assertEquals(ProveedorDB.getInstance().saveProveedor(proveedor), true);

        Proveedor proveedor2 = new Proveedor();
        proveedor2.setName("name2");
        proveedor2.setDescription("description2");
        assertEquals(ProveedorDB.getInstance().saveProveedor(proveedor2), true);
    }

    /**
     * Test of getAllProveedores method, of class ProveedorDB.
     */
    @Test(dependsOnMethods = "testGetProveedorByName")
    public void testGetAllProveedores() throws Exception {
        System.out.println("getAllProveedores");
        ArrayList result = ProveedorDB.getInstance().getAllProveedores();
        assertEquals(2, result.size());
    }

    /**
     * Test of getProveedorByName method, of class ProveedorDB.
     */
    @Test(dependsOnMethods = "testProveedorExist")
    public void testGetProveedorByName() throws Exception {
        System.out.println("getProveedorByName");
        String str = "name";
        
        Proveedor expResult = new Proveedor();
        expResult.setName("name");
        expResult.setDescription("description");

        Proveedor result = ProveedorDB.getInstance().getProveedorByName(str);
        assertEquals(result.getName(), expResult.getName());
        assertEquals(result.getDescription(), expResult.getDescription());
    }

    /**
     * Test of getProveedorById method, of class ProveedorDB.
     */
    @Test(dependsOnMethods = "testGetAllProveedores")
    public void testGetProveedorById() throws Exception {
        System.out.println("getProveedorById");
        long id = 0L;
        Proveedor expResult = null;
        Proveedor result = ProveedorDB.getInstance().getProveedorById(id);
        assertEquals(result, expResult);
    }

    /**
     * Test of deleteProveedor method, of class ProveedorDB.
     */
    @Test(dependsOnMethods = "testGetProveedorById")
    public void testDeleteProveedor() throws Exception {
        System.out.println("deleteProveedor");
        long id = 0L;
        ProveedorDB.getInstance().deleteProveedor(id);
    }

}

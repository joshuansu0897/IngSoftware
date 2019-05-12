/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

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
public class SpecificQuerysNGTest {

    public SpecificQuerysNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        new File("Configuracion/config.json").renameTo(new File("Configuracion/configProduction.json"));
        new File("Configuracion/configTest.json").renameTo(new File("Configuracion/config.json"));
        try (Connection con = ProductoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=0;");
            stm.execute("INSERT INTO Product("
                    + "	id, name, description, perecederos, proveedor_id) "
                    + "	VALUES ('1', 'name', 'description', '1', '1')");
            stm.execute("INSERT INTO Product("
                    + "	id, name, description, perecederos, proveedor_id) "
                    + "	VALUES ('2', 'name2', 'description2', '0', '2')");
        }
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=0;");
            stm.execute("INSERT INTO Movements("
                    + " product_id, added_amount, retired_amount, total) "
                    + " VALUES ('1', '100', '40', '60')");
            stm.execute("INSERT INTO Movements("
                    + " product_id, added_amount, retired_amount, total) "
                    + " VALUES ('2', '100', '0', '100')");
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=1");
            stm.execute("DELETE FROM Movements");
        }
        try (Connection con = ProductoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=1");
            stm.execute("DELETE FROM Product");
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
     * Test of getInstance method, of class SpecificQuerys.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SpecificQuerys instance = SpecificQuerys.getInstance();
        assertNotNull(SpecificQuerys.getInstance());
        assertEquals(instance, SpecificQuerys.getInstance());
    }

    /**
     * Test of getProductsAndCount method, of class SpecificQuerys.
     */
    @Test
    public void testGetProductsAndCount() throws Exception {
        System.out.println("getProductsAndCount");
        ArrayList<Object[]> expResult = new ArrayList();

        Object[] obj = new Object[]{"name", 60};
        expResult.add(obj);

        Object[] obj2 = new Object[]{"name2", 100};
        expResult.add(obj2);

        ArrayList result = SpecificQuerys.getInstance().getProductsAndCount();

        result.forEach(p -> {
            assertNotNull(expResult.stream().allMatch(ex -> ex.equals(p)));
        });
    }

    /**
     * Test of getProductsAndCountByName method, of class SpecificQuerys.
     */
    @Test
    public void testGetProductsAndCountByName() throws Exception {
        System.out.println("getProductsAndCountByName");
        String name = "name";
        Object[] expResult = new Object[]{"name", 0, 0, "60"};
        Object[] result = SpecificQuerys.getInstance().getProductsAndCountByName(name);
        assertEquals(result, expResult);
    }

}

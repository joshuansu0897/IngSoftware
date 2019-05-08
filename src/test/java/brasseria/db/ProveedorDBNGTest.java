/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.Proveedor;
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
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
    @Test(enabled=false)
    public void testGetInstance() {
        System.out.println("getInstance");
        ProveedorDB expResult = null;
        ProveedorDB result = ProveedorDB.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proveedorExist method, of class ProveedorDB.
     */
    @Test(enabled=false)
    public void testProveedorExist() throws Exception {
        System.out.println("proveedorExist");
        String name = "";
        ProveedorDB instance = null;
        boolean expResult = false;
        boolean result = instance.proveedorExist(name);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProveedor method, of class ProveedorDB.
     */
    @Test(enabled=false)
    public void testSaveProveedor() throws Exception {
        System.out.println("saveProveedor");
        Proveedor proveedor = null;
        ProveedorDB instance = null;
        boolean expResult = false;
        boolean result = instance.saveProveedor(proveedor);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProveedores method, of class ProveedorDB.
     */
    @Test(enabled=false)
    public void testGetAllProveedores() throws Exception {
        System.out.println("getAllProveedores");
        ProveedorDB instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAllProveedores();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProveedorByName method, of class ProveedorDB.
     */
    @Test(enabled=false)
    public void testGetProveedorByName() throws Exception {
        System.out.println("getProveedorByName");
        String str = "";
        ProveedorDB instance = null;
        Proveedor expResult = null;
        Proveedor result = instance.getProveedorByName(str);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProveedorById method, of class ProveedorDB.
     */
    @Test(enabled=false)
    public void testGetProveedorById() throws Exception {
        System.out.println("getProveedorById");
        long id = 0L;
        ProveedorDB instance = null;
        Proveedor expResult = null;
        Proveedor result = instance.getProveedorById(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProveedor method, of class ProveedorDB.
     */
    @Test(enabled=false)
    public void testDeleteProveedor() throws Exception {
        System.out.println("deleteProveedor");
        Long id = null;
        ProveedorDB instance = null;
        instance.deleteProveedor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

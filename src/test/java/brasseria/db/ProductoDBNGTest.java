/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.Producto;
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
public class ProductoDBNGTest {
    
    public ProductoDBNGTest() {
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
     * Test of getInstance method, of class ProductoDB.
     */
    @Test(enabled=false)
    public void testGetInstance() {
        System.out.println("getInstance");
        ProductoDB expResult = null;
        ProductoDB result = ProductoDB.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productoExist method, of class ProductoDB.
     */
    @Test(enabled=false)
    public void testProductoExist() throws Exception {
        System.out.println("productoExist");
        String name = "";
        ProductoDB instance = null;
        boolean expResult = false;
        boolean result = instance.productoExist(name);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProducto method, of class ProductoDB.
     */
    @Test(enabled=false)
    public void testSaveProducto() throws Exception {
        System.out.println("saveProducto");
        Producto producto = null;
        ProductoDB instance = null;
        boolean expResult = false;
        boolean result = instance.saveProducto(producto);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProductos method, of class ProductoDB.
     */
    @Test(enabled=false)
    public void testGetAllProductos() throws Exception {
        System.out.println("getAllProductos");
        ProductoDB instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAllProductos();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductoByName method, of class ProductoDB.
     */
    @Test(enabled=false)
    public void testGetProductoByName() throws Exception {
        System.out.println("getProductoByName");
        String str = "";
        ProductoDB instance = null;
        Producto expResult = null;
        Producto result = instance.getProductoByName(str);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProducto method, of class ProductoDB.
     */
    @Test(enabled=false)
    public void testDeleteProducto() throws Exception {
        System.out.println("deleteProducto");
        Long id = null;
        ProductoDB instance = null;
        instance.deleteProducto(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

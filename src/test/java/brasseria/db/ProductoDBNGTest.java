/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.Producto;
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
public class ProductoDBNGTest {

    public ProductoDBNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        new File("Configuracion/config.json").renameTo(new File("Configuracion/configProduction.json"));
        new File("Configuracion/configTest.json").renameTo(new File("Configuracion/config.json"));
        try (Connection con = ProductoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=0;");
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        try (Connection con = ProductoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("SET GLOBAL FOREIGN_KEY_CHECKS=1;");
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
     * Test of getInstance method, of class ProductoDB.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ProductoDB instance = ProductoDB.getInstance();
        assertNotNull(ProductoDB.getInstance());
        assertEquals(instance, ProductoDB.getInstance());
    }

    /**
     * Test of productoExist method, of class ProductoDB.
     */
    @Test(dependsOnMethods = "testSaveProducto")
    public void testProductoExist() throws Exception {
        System.out.println("productoExist");
        String name = "name";
        boolean expResult = true;
        assertEquals(ProductoDB.getInstance().productoExist(name), expResult);
    }

    /**
     * Test of saveProducto method, of class ProductoDB.
     */
    @Test
    public void testSaveProducto() throws Exception {
        System.out.println("saveProducto");
        Producto producto = new Producto();
        producto.setDescription("description");
        producto.setIdProveedor(1);
        producto.setName("name");
        producto.setPerecederos(true);

        boolean expResult = true;
        boolean result = ProductoDB.getInstance().saveProducto(producto);
        assertEquals(result, expResult);

        Producto producto2 = new Producto();
        producto2.setDescription("description2");
        producto2.setIdProveedor(2);
        producto2.setName("name2");
        producto2.setPerecederos(false);

        boolean expResult2 = true;
        boolean result2 = ProductoDB.getInstance().saveProducto(producto2);

        assertEquals(result2, expResult2);
    }

    /**
     * Test of getAllProductos method, of class ProductoDB.
     */
    @Test(dependsOnMethods = "testGetProductoByName")
    public void testGetAllProductos() throws Exception {
        System.out.println("getAllProductos");
        ArrayList result = ProductoDB.getInstance().getAllProductos();
        assertEquals(result.size(), 2);
    }

    /**
     * Test of getProductoByName method, of class ProductoDB.
     */
    @Test(dependsOnMethods = "testProductoExist")
    public void testGetProductoByName() throws Exception {
        System.out.println("getProductoByName");
        String str = "name";

        Producto expResult = new Producto();
        expResult.setDescription("description");
        expResult.setIdProveedor(1);
        expResult.setName("name");
        expResult.setPerecederos(true);

        Producto result = ProductoDB.getInstance().getProductoByName(str);
        assertEquals(result.getName(), expResult.getName());
        assertEquals(result.getDescription(), expResult.getDescription());
        assertEquals(result.getIdProveedor(), expResult.getIdProveedor());
    }

    /**
     * Test of deleteProducto method, of class ProductoDB.
     */
    @Test(dependsOnMethods = "testGetAllProductos")
    public void testDeleteProducto() throws Exception {
        System.out.println("deleteProducto");
        long id = 2;
        ProductoDB.getInstance().deleteProducto(id);
    }

}

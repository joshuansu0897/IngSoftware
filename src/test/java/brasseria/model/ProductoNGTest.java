/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.model;

import java.time.LocalDate;
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
public class ProductoNGTest {

    Producto producto = new Producto();

    public ProductoNGTest() {
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
     * Test of getId method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetId")
    public void testGetId() {
        System.out.println("getId");
        long expResult = 1;
        assertEquals(producto.getId(), expResult);
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        producto.setId(1);
    }

    /**
     * Test of getName method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetName")
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Potato";
        assertEquals(producto.getName(), expResult);
    }

    /**
     * Test of setName method, of class Producto.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Potato";
        producto.setName(name);
    }

    /**
     * Test of isPerecederos method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetPerecederos")
    public void testIsPerecederos() {
        System.out.println("isPerecederos");
        boolean expResult = true;
        assertEquals(producto.isPerecederos(), expResult);
    }

    /**
     * Test of setPerecederos method, of class Producto.
     */
    @Test
    public void testSetPerecederos() {
        System.out.println("setPerecederos");
        boolean perecederos = true;
        producto.setPerecederos(perecederos);
    }

    /**
     * Test of getIdProveedor method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetIdProveedor")
    public void testGetIdProveedor() {
        System.out.println("getIdProveedor");
        long expResult = 2;
        assertEquals(producto.getIdProveedor(), expResult);
    }

    /**
     * Test of setIdProveedor method, of class Producto.
     */
    @Test
    public void testSetIdProveedor() {
        System.out.println("setIdProveedor");
        long idProveedor = 2;
        producto.setIdProveedor(idProveedor);
    }

    /**
     * Test of getDescription method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetDescription")
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "It's a potato, I do not think I need a description";
        assertEquals(producto.getDescription(), expResult);
    }

    /**
     * Test of setDescription method, of class Producto.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "It's a potato, I do not think I need a description";
        producto.setDescription(description);
    }

    /**
     * Test of getCreateAt method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetCreateAt")
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        LocalDate expResult = LocalDate.of(2019, 1, 10);
        assertEquals(producto.getCreateAt(), expResult);
    }

    /**
     * Test of setCreateAt method, of class Producto.
     */
    @Test
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = LocalDate.of(2019, 1, 10);
        producto.setCreateAt(createAt);
    }

    /**
     * Test of getUpdateAt method, of class Producto.
     */
    @Test(dependsOnMethods = "testSetUpdateAt")
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        LocalDate expResult = LocalDate.of(2019, 2, 2);
        assertEquals(producto.getUpdateAt(), expResult);
    }

    /**
     * Test of setUpdateAt method, of class Producto.
     */
    @Test
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = LocalDate.of(2019, 2, 2);
        producto.setUpdateAt(updateAt);
    }

}

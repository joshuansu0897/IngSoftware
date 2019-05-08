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
    @Test(enabled=false)
    public void testGetId() {
        System.out.println("getId");
        Producto instance = new Producto();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Producto instance = new Producto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Producto.
     */
    @Test(enabled=false)
    public void testGetName() {
        System.out.println("getName");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Producto instance = new Producto();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPerecederos method, of class Producto.
     */
    @Test(enabled=false)
    public void testIsPerecederos() {
        System.out.println("isPerecederos");
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.isPerecederos();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerecederos method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetPerecederos() {
        System.out.println("setPerecederos");
        boolean perecederos = false;
        Producto instance = new Producto();
        instance.setPerecederos(perecederos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProveedor method, of class Producto.
     */
    @Test(enabled=false)
    public void testGetIdProveedor() {
        System.out.println("getIdProveedor");
        Producto instance = new Producto();
        long expResult = 0L;
        long result = instance.getIdProveedor();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProveedor method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetIdProveedor() {
        System.out.println("setIdProveedor");
        long idProveedor = 0L;
        Producto instance = new Producto();
        instance.setIdProveedor(idProveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Producto.
     */
    @Test(enabled=false)
    public void testGetDescription() {
        System.out.println("getDescription");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Producto instance = new Producto();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreateAt method, of class Producto.
     */
    @Test(enabled=false)
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        Producto instance = new Producto();
        LocalDate expResult = null;
        LocalDate result = instance.getCreateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateAt method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = null;
        Producto instance = new Producto();
        instance.setCreateAt(createAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdateAt method, of class Producto.
     */
    @Test(enabled=false)
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        Producto instance = new Producto();
        LocalDate expResult = null;
        LocalDate result = instance.getUpdateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateAt method, of class Producto.
     */
    @Test(enabled=false)
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = null;
        Producto instance = new Producto();
        instance.setUpdateAt(updateAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

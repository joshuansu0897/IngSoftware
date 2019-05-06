/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.model;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joshuansu
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Producto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Producto instance = new Producto();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
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
    @Test
    public void testGetName() {
        System.out.println("getName");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Producto.
     */
    @Test
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
    @Test
    public void testIsPerecederos() {
        System.out.println("isPerecederos");
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.isPerecederos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerecederos method, of class Producto.
     */
    @Test
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
    @Test
    public void testGetIdProveedor() {
        System.out.println("getIdProveedor");
        Producto instance = new Producto();
        long expResult = 0L;
        long result = instance.getIdProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProveedor method, of class Producto.
     */
    @Test
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
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Producto.
     */
    @Test
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
    @Test
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        Producto instance = new Producto();
        LocalDate expResult = null;
        LocalDate result = instance.getCreateAt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateAt method, of class Producto.
     */
    @Test
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
    @Test
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        Producto instance = new Producto();
        LocalDate expResult = null;
        LocalDate result = instance.getUpdateAt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateAt method, of class Producto.
     */
    @Test
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = null;
        Producto instance = new Producto();
        instance.setUpdateAt(updateAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

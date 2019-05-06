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
public class ProveedorTest {
    
    public ProveedorTest() {
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
     * Test of getId method, of class Proveedor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Proveedor instance = new Proveedor();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Proveedor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Proveedor instance = new Proveedor();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Proveedor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Proveedor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Proveedor instance = new Proveedor();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Proveedor.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Proveedor.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Proveedor instance = new Proveedor();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreateAt method, of class Proveedor.
     */
    @Test
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        Proveedor instance = new Proveedor();
        LocalDate expResult = null;
        LocalDate result = instance.getCreateAt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateAt method, of class Proveedor.
     */
    @Test
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = null;
        Proveedor instance = new Proveedor();
        instance.setCreateAt(createAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdateAt method, of class Proveedor.
     */
    @Test
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        Proveedor instance = new Proveedor();
        LocalDate expResult = null;
        LocalDate result = instance.getUpdateAt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateAt method, of class Proveedor.
     */
    @Test
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = null;
        Proveedor instance = new Proveedor();
        instance.setUpdateAt(updateAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

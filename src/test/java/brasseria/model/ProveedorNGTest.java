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
public class ProveedorNGTest {
    
    public ProveedorNGTest() {
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
     * Test of getId method, of class Proveedor.
     */
    @Test(enabled=false)
    public void testGetId() {
        System.out.println("getId");
        Proveedor instance = new Proveedor();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Proveedor.
     */
    @Test(enabled=false)
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
    @Test(enabled=false)
    public void testGetName() {
        System.out.println("getName");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Proveedor.
     */
    @Test(enabled=false)
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
    @Test(enabled=false)
    public void testGetDescription() {
        System.out.println("getDescription");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Proveedor.
     */
    @Test(enabled=false)
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
    @Test(enabled=false)
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        Proveedor instance = new Proveedor();
        LocalDate expResult = null;
        LocalDate result = instance.getCreateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateAt method, of class Proveedor.
     */
    @Test(enabled=false)
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
    @Test(enabled=false)
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        Proveedor instance = new Proveedor();
        LocalDate expResult = null;
        LocalDate result = instance.getUpdateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateAt method, of class Proveedor.
     */
    @Test(enabled=false)
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = null;
        Proveedor instance = new Proveedor();
        instance.setUpdateAt(updateAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

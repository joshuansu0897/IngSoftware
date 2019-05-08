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
public class MovimientoNGTest {
    
    public MovimientoNGTest() {
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
     * Test of getId method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetId() {
        System.out.println("getId");
        Movimiento instance = new Movimiento();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Movimiento instance = new Movimiento();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct_id method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetProduct_id() {
        System.out.println("getProduct_id");
        Movimiento instance = new Movimiento();
        long expResult = 0L;
        long result = instance.getProduct_id();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduct_id method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetProduct_id() {
        System.out.println("setProduct_id");
        long product_id = 0L;
        Movimiento instance = new Movimiento();
        instance.setProduct_id(product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdded_amount method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetAdded_amount() {
        System.out.println("getAdded_amount");
        Movimiento instance = new Movimiento();
        long expResult = 0L;
        long result = instance.getAdded_amount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdded_amount method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetAdded_amount() {
        System.out.println("setAdded_amount");
        long added_amount = 0L;
        Movimiento instance = new Movimiento();
        instance.setAdded_amount(added_amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRetired_amount method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetRetired_amount() {
        System.out.println("getRetired_amount");
        Movimiento instance = new Movimiento();
        long expResult = 0L;
        long result = instance.getRetired_amount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRetired_amount method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetRetired_amount() {
        System.out.println("setRetired_amount");
        long retired_amount = 0L;
        Movimiento instance = new Movimiento();
        instance.setRetired_amount(retired_amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetTotal() {
        System.out.println("getTotal");
        Movimiento instance = new Movimiento();
        long expResult = 0L;
        long result = instance.getTotal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetTotal() {
        System.out.println("setTotal");
        long total = 0L;
        Movimiento instance = new Movimiento();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreateAt method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        Movimiento instance = new Movimiento();
        LocalDate expResult = null;
        LocalDate result = instance.getCreateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateAt method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = null;
        Movimiento instance = new Movimiento();
        instance.setCreateAt(createAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdateAt method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        Movimiento instance = new Movimiento();
        LocalDate expResult = null;
        LocalDate result = instance.getUpdateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateAt method, of class Movimiento.
     */
    @Test(enabled=false)
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = null;
        Movimiento instance = new Movimiento();
        instance.setUpdateAt(updateAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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

    Movimiento movimiento = new Movimiento();

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
    @Test(dependsOnMethods = "testSetId")
    public void testGetId() {
        System.out.println("getId");
        long expResult = 1;
        assertEquals(movimiento.getId(), expResult);
    }

    /**
     * Test of setId method, of class Movimiento.
     */
    @Test
    public void testSetId() {
        System.out.println("SetId");
        movimiento.setId(1);
    }

    /**
     * Test of getProduct_id method, of class Movimiento.
     */
    @Test(dependsOnMethods = "testSetProduct_id")
    public void testGetProduct_id() {
        System.out.println("getProduct_id");
        long expResult = 1;
        assertEquals(movimiento.getProduct_id(), expResult);

    }

    /**
     * Test of setProduct_id method, of class Movimiento.
     */
    @Test
    public void testSetProduct_id() {
        System.out.println("setProduct_id");
        movimiento.setProduct_id(1);
    }

    /**
     * Test of getAdded_amount method, of class Movimiento.
     */
    @Test(dependsOnMethods = "testSetAdded_amount")
    public void testGetAdded_amount() {
        System.out.println("getAdded_amount");
        long expResult = 100;
        assertEquals(movimiento.getAdded_amount(), expResult);
    }

    /**
     * Test of setAdded_amount method, of class Movimiento.
     */
    @Test
    public void testSetAdded_amount() {
        System.out.println("setAdded_amount");
        movimiento.setAdded_amount(100);
    }

    /**
     * Test of getRetired_amount method, of class Movimiento.
     */
    @Test(dependsOnMethods = "testSetRetired_amount")
    public void testGetRetired_amount() {
        System.out.println("getRetired_amount");
        long expResult = 60;
        assertEquals(movimiento.getRetired_amount(), expResult);
    }

    /**
     * Test of setRetired_amount method, of class Movimiento.
     */
    @Test
    public void testSetRetired_amount() {
        System.out.println("setRetired_amount");
        movimiento.setRetired_amount(60);
    }

    /**
     * Test of getTotal method, of class Movimiento.
     */
    @Test(dependsOnMethods = "testSetTotal")
    public void testGetTotal() {
        System.out.println("getTotal");
        long expResult = 40;
        assertEquals(movimiento.getTotal(), expResult);
    }

    /**
     * Test of setTotal method, of class Movimiento.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        movimiento.setTotal(40);
    }

    /**
     * Test of getCreateAt method, of class Movimiento.
     */
    @Test(dependsOnMethods = "testSetCreateAt")
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        LocalDate expResult = LocalDate.of(2019, 2, 20);
        assertEquals(movimiento.getCreateAt(), expResult);
    }

    /**
     * Test of setCreateAt method, of class Movimiento.
     */
    @Test
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = LocalDate.of(2019, 2, 20);
        movimiento.setCreateAt(createAt);
    }

    /**
     * Test of getUpdateAt method, of class Movimiento.
     */
    @Test(dependsOnMethods = "testSetUpdateAt")
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        LocalDate expResult = LocalDate.of(2019, 8, 30);
        assertEquals(movimiento.getUpdateAt(), expResult);
    }

    /**
     * Test of setUpdateAt method, of class Movimiento.
     */
    @Test
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = LocalDate.of(2019, 8, 30);
        movimiento.setUpdateAt(updateAt);
    }

}

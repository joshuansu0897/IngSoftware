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
public class UserNGTest {
    
    public UserNGTest() {
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
     * Test of getId method, of class User.
     */
    @Test(enabled=false)
    public void testGetId() {
        System.out.println("getId");
        User instance = new User();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class User.
     */
    @Test(enabled=false)
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        User instance = new User();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class User.
     */
    @Test(enabled=false)
    public void testGetName() {
        System.out.println("getName");
        User instance = new User();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class User.
     */
    @Test(enabled=false)
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        User instance = new User();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test(enabled=false)
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test(enabled=false)
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User instance = new User();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test(enabled=false)
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test(enabled=false)
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreateAt method, of class User.
     */
    @Test(enabled=false)
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        User instance = new User();
        LocalDate expResult = null;
        LocalDate result = instance.getCreateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreateAt method, of class User.
     */
    @Test(enabled=false)
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = null;
        User instance = new User();
        instance.setCreateAt(createAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdateAt method, of class User.
     */
    @Test(enabled=false)
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        User instance = new User();
        LocalDate expResult = null;
        LocalDate result = instance.getUpdateAt();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateAt method, of class User.
     */
    @Test(enabled=false)
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = null;
        User instance = new User();
        instance.setUpdateAt(updateAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

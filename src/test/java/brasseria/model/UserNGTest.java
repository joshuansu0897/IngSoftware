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

    User user = new User();

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
    @Test(dependsOnMethods = "testSetId")
    public void testGetId() {
        System.out.println("getId");
        long expResult = 1;
        long result = user.getId();
        assertEquals(result, expResult);
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 1;
        user.setId(id);
    }

    /**
     * Test of getName method, of class User.
     */
    @Test(dependsOnMethods = "testSetName")
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Juan";
        String result = user.getName();
        assertEquals(result, expResult);
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Juan";
        user.setName(name);
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test(dependsOnMethods = "testSetUsername")
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "juanitoAdm";
        String result = user.getUsername();
        assertEquals(result, expResult);
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "juanitoAdm";
        user.setUsername(username);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test(dependsOnMethods = "testSetPassword")
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "password-secret-encrypt";
        String result = user.getPassword();
        assertEquals(result, expResult);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "password-secret-encrypt";
        user.setPassword(password);
    }

    /**
     * Test of getCreateAt method, of class User.
     */
    @Test(dependsOnMethods = "testSetCreateAt")
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        LocalDate expResult = LocalDate.of(2018, 5, 10);
        LocalDate result = user.getCreateAt();
        assertEquals(result, expResult);
    }

    /**
     * Test of setCreateAt method, of class User.
     */
    @Test
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = LocalDate.of(2018, 5, 10);
        user.setCreateAt(createAt);
    }

    /**
     * Test of getUpdateAt method, of class User.
     */
    @Test(dependsOnMethods = "testSetUpdateAt")
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        LocalDate expResult = LocalDate.of(2018, 5, 11);
        LocalDate result = user.getUpdateAt();
        assertEquals(result, expResult);
    }

    /**
     * Test of setUpdateAt method, of class User.
     */
    @Test
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = LocalDate.of(2018, 5, 11);
        user.setUpdateAt(updateAt);
    }

}

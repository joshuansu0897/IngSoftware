/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.User;
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
public class UserDBNGTest {
    
    public UserDBNGTest() {
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
     * Test of getInstance method, of class UserDB.
     */
    @Test(enabled=false)
    public void testGetInstance() {
        System.out.println("getInstance");
        UserDB expResult = null;
        UserDB result = UserDB.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticacion method, of class UserDB.
     */
    @Test(enabled=false)
    public void testAutenticacion() throws Exception {
        System.out.println("autenticacion");
        String usuario = "";
        String contraseña = "";
        UserDB instance = null;
        boolean expResult = false;
        boolean result = instance.autenticacion(usuario, contraseña);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userExist method, of class UserDB.
     */
    @Test(enabled=false)
    public void testUserExist() throws Exception {
        System.out.println("userExist");
        String uss = "";
        UserDB instance = null;
        boolean expResult = false;
        boolean result = instance.userExist(uss);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class UserDB.
     */
    @Test(enabled=false)
    public void testSaveUser() throws Exception {
        System.out.println("saveUser");
        User user = null;
        UserDB instance = null;
        boolean expResult = false;
        boolean result = instance.saveUser(user);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUsers method, of class UserDB.
     */
    @Test(enabled=false)
    public void testGetAllUsers() throws Exception {
        System.out.println("getAllUsers");
        UserDB instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAllUsers();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByUsername method, of class UserDB.
     */
    @Test(enabled=false)
    public void testGetUserByUsername() throws Exception {
        System.out.println("getUserByUsername");
        String str = "";
        UserDB instance = null;
        User expResult = null;
        User result = instance.getUserByUsername(str);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserDB.
     */
    @Test(enabled=false)
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        Long id = null;
        UserDB instance = null;
        instance.deleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

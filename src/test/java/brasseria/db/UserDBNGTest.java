/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.User;
import brasseria.util.Util;
import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
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
        if (!(new File("Configuracion/configProduction.json")).exists()) {
            new File("Configuracion/config.json").renameTo(new File("Configuracion/configProduction.json"));
            new File("Configuracion/configTest.json").renameTo(new File("Configuracion/config.json"));
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        try (Connection con = MovimientoDB.getInstance().getConnection(); Statement stm = con.createStatement()) {
            stm.execute("DELETE FROM User");
        }
        if (!(new File("Configuracion/configTest.json")).exists()) {
            new File("Configuracion/config.json").renameTo(new File("Configuracion/configTest.json"));
            new File("Configuracion/configProduction.json").renameTo(new File("Configuracion/config.json"));
        }
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
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserDB instance = UserDB.getInstance();
        assertNotNull(UserDB.getInstance());
        assertEquals(instance, UserDB.getInstance());
    }

    /**
     * Test of autenticacion method, of class UserDB.
     */
    @Test(dependsOnMethods = "testGetUserByUsername")
    public void testAutenticacion() throws Exception {
        System.out.println("autenticacion");
        String usuario = "juanitoAdm";
        String contraseña = "password de juanito es mega secreto";

        boolean expResult = true;
        boolean result = UserDB.getInstance().autenticacion(usuario, contraseña);
        assertEquals(result, expResult);
    }

    /**
     * Test of userExist method, of class UserDB.
     */
    @Test(dependsOnMethods = "testSaveUser")
    public void testUserExist() throws Exception {
        System.out.println("userExist");
        String uss = "juanitoAdm";
        boolean expResult = true;

        boolean result = UserDB.getInstance().userExist(uss);
        assertEquals(result, expResult);
    }

    /**
     * Test of saveUser method, of class UserDB.
     */
    @Test
    public void testSaveUser() throws Exception {
        System.out.println("saveUser");
        User user = new User();
        user.setName("Juan");
        user.setPassword(Util.encrypt("password de juanito es mega secreto"));
        user.setUsername("juanitoAdm");

        boolean expResult = true;

        boolean result = UserDB.getInstance().saveUser(user);
        assertEquals(result, expResult);
    }

    /**
     * Test of getAllUsers method, of class UserDB.
     */
    @Test(dependsOnMethods = "testGetUserByUsername")
    public void testGetAllUsers() throws Exception {
        System.out.println("getAllUsers");
        ArrayList result = UserDB.getInstance().getAllUsers();
        assertEquals(result.size(), 1);
    }

    /**
     * Test of getUserByUsername method, of class UserDB.
     */
    @Test(dependsOnMethods = "testUserExist")
    public void testGetUserByUsername() throws Exception {
        System.out.println("getUserByUsername");
        String str = "juanitoAdm";

        User expResult = new User();
        expResult.setName("Juan");
        expResult.setUsername("juanitoAdm");

        User result = UserDB.getInstance().getUserByUsername(str);
        assertEquals(result.getName(), expResult.getName());
        assertEquals(result.getUsername(), expResult.getUsername());
    }

    /**
     * Test of deleteUser method, of class UserDB.
     */
    @Test(dependsOnMethods = "testGetAllUsers")
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        long id = 1;
        UserDB.getInstance().deleteUser(id);
    }

}

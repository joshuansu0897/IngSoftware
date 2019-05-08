/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

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
public class SpecificQuerysNGTest {
    
    public SpecificQuerysNGTest() {
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
     * Test of getInstance method, of class SpecificQuerys.
     */
    @Test(enabled=false)
    public void testGetInstance() {
        System.out.println("getInstance");
        SpecificQuerys expResult = null;
        SpecificQuerys result = SpecificQuerys.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductsAndCount method, of class SpecificQuerys.
     */
    @Test(enabled=false)
    public void testGetProductsAndCount() throws Exception {
        System.out.println("getProductsAndCount");
        SpecificQuerys instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getProductsAndCount();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductsAndCountByName method, of class SpecificQuerys.
     */
    @Test(enabled=false)
    public void testGetProductsAndCountByName() throws Exception {
        System.out.println("getProductsAndCountByName");
        String name = "";
        SpecificQuerys instance = null;
        Object[] expResult = null;
        Object[] result = instance.getProductsAndCountByName(name);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

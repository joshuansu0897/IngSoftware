/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.util;

import java.time.LocalDate;
import java.util.Date;
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
public class UtilNGTest {
    
    public UtilNGTest() {
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
     * Test of getLocalDateFromDate method, of class Util.
     */
    @Test(enabled=false)
    public void testGetLocalDateFromDate() {
        System.out.println("getLocalDateFromDate");
        Date d = null;
        LocalDate expResult = null;
        LocalDate result = Util.getLocalDateFromDate(d);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFromLocalDate method, of class Util.
     */
    @Test(enabled=false)
    public void testGetDateFromLocalDate() {
        System.out.println("getDateFromLocalDate");
        LocalDate l = null;
        Date expResult = null;
        Date result = Util.getDateFromLocalDate(l);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LocalDateToString method, of class Util.
     */
    @Test(enabled=false)
    public void testLocalDateToString() {
        System.out.println("LocalDateToString");
        LocalDate l = null;
        String expResult = "";
        String result = Util.LocalDateToString(l);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LocalDateToStringSpanish method, of class Util.
     */
    @Test(enabled=false)
    public void testLocalDateToStringSpanish() {
        System.out.println("LocalDateToStringSpanish");
        LocalDate l = null;
        String expResult = "";
        String result = Util.LocalDateToStringSpanish(l);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CapitalizeFirstLetter method, of class Util.
     */
    @Test(enabled=false)
    public void testCapitalizeFirstLetter() {
        System.out.println("CapitalizeFirstLetter");
        String str = "";
        String expResult = "";
        String result = Util.CapitalizeFirstLetter(str);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class Util.
     */
    @Test(enabled=false)
    public void testEncrypt() {
        System.out.println("encrypt");
        String str = "";
        String expResult = "";
        String result = Util.encrypt(str);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

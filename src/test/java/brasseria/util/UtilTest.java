/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.util;

import java.time.LocalDate;
import java.util.Date;
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
public class UtilTest {
    
    public UtilTest() {
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
     * Test of getLocalDateFromDate method, of class Util.
     */
    @Test
    public void testGetLocalDateFromDate() {
        System.out.println("getLocalDateFromDate");
        Date d = null;
        LocalDate expResult = null;
        LocalDate result = Util.getLocalDateFromDate(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFromLocalDate method, of class Util.
     */
    @Test
    public void testGetDateFromLocalDate() {
        System.out.println("getDateFromLocalDate");
        LocalDate l = null;
        Date expResult = null;
        Date result = Util.getDateFromLocalDate(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LocalDateToString method, of class Util.
     */
    @Test
    public void testLocalDateToString() {
        System.out.println("LocalDateToString");
        LocalDate l = null;
        String expResult = "";
        String result = Util.LocalDateToString(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LocalDateToStringSpanish method, of class Util.
     */
    @Test
    public void testLocalDateToStringSpanish() {
        System.out.println("LocalDateToStringSpanish");
        LocalDate l = null;
        String expResult = "";
        String result = Util.LocalDateToStringSpanish(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CapitalizeFirstLetter method, of class Util.
     */
    @Test
    public void testCapitalizeFirstLetter() {
        System.out.println("CapitalizeFirstLetter");
        String str = "";
        String expResult = "";
        String result = Util.CapitalizeFirstLetter(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class Util.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String str = "";
        String expResult = "";
        String result = Util.encrypt(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

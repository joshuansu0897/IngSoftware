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
    @Test
    public void testGetLocalDateFromDate() {
        System.out.println("getLocalDateFromDate");
        Date d = new Date(1557303273480L);
        LocalDate expResult = LocalDate.of(2019, 5, 8);
        LocalDate result = Util.getLocalDateFromDate(d);
        assertEquals(result, expResult);
    }

    /**
     * Test of getDateFromLocalDate method, of class Util.
     */
    @Test
    public void testGetDateFromLocalDate() {
        System.out.println("getDateFromLocalDate");
        LocalDate l = LocalDate.of(2019, 5, 8);
        Date expResult = new Date(1557298800000L);
        Date result = Util.getDateFromLocalDate(l);
        assertEquals(result, expResult);
    }

    /**
     * Test of LocalDateToString method, of class Util.
     */
    @Test
    public void testLocalDateToString() {
        System.out.println("LocalDateToString");
        LocalDate l = LocalDate.of(2019, 2, 10);
        String expResult = "2019-02-10";
        String result = Util.LocalDateToString(l);
        assertEquals(result, expResult);
        
    }

    /**
     * Test of LocalDateToStringSpanish method, of class Util.
     */
    @Test
    public void testLocalDateToStringSpanish() {
        System.out.println("LocalDateToStringSpanish");
        LocalDate l = LocalDate.of(2019, 2, 10);
        String expResult = "domingo 10 de febrero del 2019";
        String result = Util.LocalDateToStringSpanish(l);
        assertEquals(result, expResult);
    }

    /**
     * Test of CapitalizeFirstLetter method, of class Util.
     */
    @Test
    public void testCapitalizeFirstLetter() {
        System.out.println("CapitalizeFirstLetter");
        String str = "hola";
        String expResult = "Hola";
        String result = Util.CapitalizeFirstLetter(str);
        assertEquals(result, expResult);
    }

    /**
     * Test of encrypt method, of class Util.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String str = "text to encrypt";
        String expResult = "d9628901d13de4f6668dfabf049ec325aaa738fc956cfcaca2d047ffe95c56fe";
        String result = Util.encrypt(str);
        assertEquals(result, expResult);
    }
    
}

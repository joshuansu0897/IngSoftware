/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseria.db;

import brasseria.model.Movimiento;
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
public class MovimientoDBNGTest {
    
    public MovimientoDBNGTest() {
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
     * Test of getInstance method, of class MovimientoDB.
     */
    @Test(enabled=false)
    public void testGetInstance() {
        System.out.println("getInstance");
        MovimientoDB expResult = null;
        MovimientoDB result = MovimientoDB.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMovimiento method, of class MovimientoDB.
     */
    @Test(enabled=false)
    public void testSaveMovimiento() throws Exception {
        System.out.println("saveMovimiento");
        Movimiento movimiento = null;
        MovimientoDB instance = null;
        instance.saveMovimiento(movimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveTablaMovimientos method, of class MovimientoDB.
     */
    @Test(enabled=false)
    public void testSaveTablaMovimientos() throws Exception {
        System.out.println("saveTablaMovimientos");
        ArrayList<Movimiento> movimientos = null;
        MovimientoDB instance = null;
        instance.saveTablaMovimientos(movimientos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

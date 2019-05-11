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
public class ProveedorNGTest {

    Proveedor proveedor = new Proveedor();

    public ProveedorNGTest() {
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
     * Test of getId method, of class Proveedor.
     */
    @Test(dependsOnMethods = "testSetId")
    public void testGetId() {
        System.out.println("getId");
        long expResult = 1;
        long result = proveedor.getId();
        assertEquals(result, expResult);
    }

    /**
     * Test of setId method, of class Proveedor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 1;
        proveedor.setId(id);
    }

    /**
     * Test of getName method, of class Proveedor.
     */
    @Test(dependsOnMethods = "testSetName")
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Arrow Head Potatoes";
        String result = proveedor.getName();
        assertEquals(result, expResult);
    }

    /**
     * Test of setName method, of class Proveedor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Arrow Head Potatoes";
        proveedor.setName(name);
    }

    /**
     * Test of getDescription method, of class Proveedor.
     */
    @Test(dependsOnMethods = "testSetDescription")
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Moss Produce, LLC purchased the existing Arrowhead Potato Company facility in 2007"
                + " and continues operations under the trade name of Arrowhead Potato Company. "
                + "Arrowhead Potato Company is a business within a family of businesses "
                + "owned by the Moss family and is vertically integrated "
                + "with the Moss Farms farming operation. "
                + "This vertical integration has provided Arrowhead "
                + "Potato Company a consistent supply of "
                + "high quality Idaho potatoes. "
                + "Arrowhead Potato Company sells Idaho potatoes to local "
                + "individuals and restaurants and to national food service companies.";
        String result = proveedor.getDescription();
        assertEquals(result, expResult);
    }

    /**
     * Test of setDescription method, of class Proveedor.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Moss Produce, LLC purchased the existing Arrowhead Potato Company facility in 2007"
                + " and continues operations under the trade name of Arrowhead Potato Company. "
                + "Arrowhead Potato Company is a business within a family of businesses "
                + "owned by the Moss family and is vertically integrated "
                + "with the Moss Farms farming operation. "
                + "This vertical integration has provided Arrowhead "
                + "Potato Company a consistent supply of "
                + "high quality Idaho potatoes. "
                + "Arrowhead Potato Company sells Idaho potatoes to local "
                + "individuals and restaurants and to national food service companies.";

        proveedor.setDescription(description);
    }

    /**
     * Test of getCreateAt method, of class Proveedor.
     */
    @Test(dependsOnMethods = "testSetCreateAt")
    public void testGetCreateAt() {
        System.out.println("getCreateAt");
        LocalDate expResult = LocalDate.of(2019, 1, 10);
        assertEquals(proveedor.getCreateAt(), expResult);
    }

    /**
     * Test of setCreateAt method, of class Proveedor.
     */
    @Test
    public void testSetCreateAt() {
        System.out.println("setCreateAt");
        LocalDate createAt = LocalDate.of(2019, 1, 10);
        proveedor.setCreateAt(createAt);
    }

    /**
     * Test of getUpdateAt method, of class Proveedor.
     */
    @Test(dependsOnMethods = "testSetUpdateAt")
    public void testGetUpdateAt() {
        System.out.println("getUpdateAt");
        LocalDate expResult = LocalDate.of(2019, 1, 11);
        LocalDate result = proveedor.getUpdateAt();
        assertEquals(result, expResult);
    }

    /**
     * Test of setUpdateAt method, of class Proveedor.
     */
    @Test
    public void testSetUpdateAt() {
        System.out.println("setUpdateAt");
        LocalDate updateAt = LocalDate.of(2019, 1, 11);
        proveedor.setUpdateAt(updateAt);
    }

}

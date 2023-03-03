/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author irina
 */
public class NumerosPrimosTest {

    public NumerosPrimosTest() {
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
     * Test of main method, of class NumerosPrimos.
     */
    
    @Test
    public void test1() {
        CribaEratostenes.generarPrimos(0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void test2() {
        CribaEratostenes.generarPrimos(2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void test3() {
        CribaEratostenes.generarPrimos(3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void test4() {
        CribaEratostenes.generarPrimos(100);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}



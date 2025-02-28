/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IOpc
 */
public class CalculoimpuestoTest {
    
    public CalculoimpuestoTest() {
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
     * Test of calcularAvaluo method, of class Calculoimpuesto.
     */
    @Test
    public void testCalcularAvaluo() {
        System.out.println("calcularAvaluo");
        Vehiculo vehiculo = new Vehiculo ("Mazda", "Particular", 2020,1600,60000000);
        Calculoimpuesto instance = new Calculoimpuesto();
        double expResult = 0.0;
        double result = instance.calcularAvaluo(vehiculo);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImpuesto method, of class Calculoimpuesto.
     */
    @Test
    public void testCalcularImpuesto() {
        System.out.println("calcularImpuesto");
        Vehiculo vehiculo = new Vehiculo ("Mazda", "Particular", 2020,1600,60000000);
        Calculoimpuesto instance = new Calculoimpuesto();
        double expResult = 0.0;
        double result = instance.calcularImpuesto(vehiculo);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

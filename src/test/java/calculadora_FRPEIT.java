/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ceti
 */
public class calculadora_FRPEIT {
    
    public calculadora_FRPEIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Suma method, of class calculadora_FRPE.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = calculadora_FRPE.Suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Resta method, of class calculadora_FRPE.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = calculadora_FRPE.Resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Multiplicacion method, of class calculadora_FRPE.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = calculadora_FRPE.Multiplicacion(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of Division method, of class calculadora_FRPE.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int a = 4;
        int b = 2;
        int expResult = 2;
        int result = calculadora_FRPE.Division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of Suma_modificada method, of class calculadora_FRPE.
     */
    @Test
    public void testSuma_modificada() {
        System.out.println("Suma_modificada");
        int a = 0;
        int b = 0;
        int c = 0;
        int expResult = 0;
        int result = calculadora_FRPE.Suma_modificada(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class calculadora_FRPE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        calculadora_FRPE.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}

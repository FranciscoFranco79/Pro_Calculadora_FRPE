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
public class calculadora_FRPETest {
    
    public calculadora_FRPETest() {
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
        int a = 5;
        int b = 5;
        int expResult = 10;
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
        int a = 5;
        int b = 5;
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
        int a = 2;
        int b = 4;
        int expResult = 8;
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
        int a = 3;
        int b = 4;
        int c = 5;
        int expResult = 12;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import exceptions.DivisionByZeroException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis.assulfi
 */
public class NumberOperationsTest {
    
    public NumberOperationsTest() {
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
     * Test of multiplication method, of class NumberOperations.
     */
    @Test
    public void testIntegerMultiplication() {
        System.out.println("integer multiplication");
        int a = 2;
        int b = 2;
        Number expResult = 4;
        Number result = NumberOperations.multiplication(a, b);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of multiplication method, of class NumberOperations.
     */
    @Test
    public void testFloatMultiplication() {
        System.out.println("float multiplication");
        float a = 2.0f;
        float b = 2.0f;
        Number expResult = 4.0f;
        Number result = NumberOperations.multiplication(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongMultiplication() {
        System.out.println("long multiplication");
        long a = 2;
        long b = 2;
        Number expResult = (long) 4;
        Number result = NumberOperations.multiplication(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleMultiplication() {
        System.out.println("double multiplication");
        double a = 2.0;
        double b = 2.0;
        Number expResult = 4.0;
        Number result = NumberOperations.multiplication(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiplication() {
        System.out.println("null multiplication");
        int a = 2;
        double b = 2.0;
        Number expResult = null;
        Number result = NumberOperations.multiplication(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of summation method, of class NumberOperations.
     */
    @Test
    public void testIntegerSummation() {
        System.out.println("integer summation");
        int a = 2;
        int b = 2;
        Number expResult = 4;
        Number result = NumberOperations.summation(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongSummation() {
        System.out.println("long summation");
        long a = 2;
        long b = 2;
        Number expResult = (long) 4;
        Number result = NumberOperations.summation(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFloatSummation() {
        System.out.println("float summation");
        float a = 2.0f;
        float b = 2.0f;
        Number expResult = 4.0f;
        Number result = NumberOperations.summation(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleSummation() {
        System.out.println("double summation");
        double a = 2.0;
        double b = 2.0;
        Number expResult = 4.0;
        Number result = NumberOperations.summation(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSummation() {
        System.out.println("null summation");
        int a = 2;
        double b = 2.0;
        Number expResult = null;
        Number result = NumberOperations.summation(a, b);
        assertEquals(expResult, result);
    }


    /**
     * Test of subtraction method, of class NumberOperations.
     */
    @Test
    public void testIntegerSubtraction() {
        System.out.println("integer subtraction");
        int a = 4;
        int b = 2;
        Number expResult = 2;
        Number result = NumberOperations.subtraction(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFloatSubtraction() {
        System.out.println("float subtraction");
        float a = 4.0f;
        float b = 2.0f;
        Number expResult = 2.0f;
        Number result = NumberOperations.subtraction(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongSubtraction() {
        System.out.println("long subtraction");
        long a = 4;
        long b = 2;
        Number expResult = (long) 2;
        Number result = NumberOperations.subtraction(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleSubtraction() {
        System.out.println("double subtraction");
        double a = 4.0;
        double b = 2.0;
        Number expResult = 2.0;
        Number result = NumberOperations.subtraction(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSubtraction() {
        System.out.println("null subtraction");
        int a = 4;
        double b = 2.0;
        Number expResult = null;
        Number result = NumberOperations.subtraction(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class NumberOperations.
     */
    @Test
    public void testIntegerDivision() throws DivisionByZeroException {
        System.out.println("integer division");
        int a = 4;
        int b = 2;
        Number expResult = 2;
        Number result = NumberOperations.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFloatDivision() throws DivisionByZeroException {
        System.out.println("float division");
        float a = 4.0f;
        float b = 2.0f;
        Number expResult = 2.0f;
        Number result = NumberOperations.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongDivision() throws DivisionByZeroException {
        System.out.println("long division");
        long a = 4;
        long b = 2;
        Number expResult = (long) 2;
        Number result = NumberOperations.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleDivision() throws DivisionByZeroException {
        System.out.println("double division");
        double a = 4.0;
        double b = 2.0;
        Number expResult = 2.0;
        Number result = NumberOperations.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test()
    public void testNullDivision() throws DivisionByZeroException {
        System.out.println("null division");
        int a = 4;
        double b = 2.0;
        Number expResult = null;
        Number result = NumberOperations.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test(expected = DivisionByZeroException.class)
    public void testDivisionByZero() throws DivisionByZeroException {
        System.out.println("division by zero exception");
        int a = 4;
        int b = 0;
        Number result = NumberOperations.division(a, b);
    }
}

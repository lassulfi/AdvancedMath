/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

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
public class MatrixOperationsTest {
    
    public MatrixOperationsTest() {
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
     * Test of transpose method, of class MatrixOperations.
     */
    @Test
    public void testTransposeNumberClass() {
        System.out.println("transpose Number class matrix");
        Number[][] matrix = {{1, 2, 3}, {4, 5, 6},{7, 8 ,9}};
        MatrixOperations instance = new MatrixOperations();
        Number[][] expResult = {{1, 4, 7}, {2, 5, 8},{3, 6 ,9}};
        Number[][] result = instance.transpose(matrix);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testTransposePrimitiveMatrix() {
        System.out.println("transpose matrix of Integer types");
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6},{7, 8 ,9}};
        MatrixOperations instance = new MatrixOperations();
        Number[][] expResult = {{1, 4, 7}, {2, 5, 8},{3, 6 ,9}};
        Number[][] result = instance.transpose(matrix);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of multiplyMatrixVector method, of class MatrixOperations.
     */
    @Test
    public void testMultiplyMatrixVector() throws Exception {
        System.out.println("multiplyMatrixVector");
        Number[][] matrix = null;
        Number[] vector = null;
        MatrixOperations instance = new MatrixOperations();
        Number[] expResult = null;
        Number[] result = instance.multiplyMatrixVector(matrix, vector);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of multiplyMatrices method, of class MatrixOperations.
     */
    @Test
    public void testMultiplyMatrices() throws Exception {
        System.out.println("multiplyMatrices");
        Number[][] matrixA = null;
        Number[][] matrixB = null;
        MatrixOperations instance = new MatrixOperations();
        Number[][] expResult = null;
        Number[][] result = instance.multiplyMatrices(matrixA, matrixB);
        assertArrayEquals(expResult, result);
    }
    
}

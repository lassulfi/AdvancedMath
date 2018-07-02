/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;

import exceptions.InvalidSizeExcpetion;
import matrices.interfaces.IMatrixOperations;
import numbers.NumberOperations;

/**
 *
 * @author luis.assulfi
 */
public class MatrixOperations implements IMatrixOperations{
    
    public MatrixOperations(){
    }
    
    /**
     * Transpose a matrix NxN or NxM
     * @param matrix matrix NxN or NxM
     * @return the transposed matrix
     * @throws NumberFormatException 
     */
    @Override
    public Number[][] transpose(Number[][] matrix) throws NumberFormatException{
        
        int lines = matrix.length;
        int columns = matrix[0].length;
        
        Number[][] transposeMatrix = new Number[columns][lines];
        
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        
        return transposeMatrix;
    }
    
    @Override
    public Number[] multiplyMatrixVector(Number[][] matrix, Number[] vector) 
            throws NumberFormatException, InvalidSizeExcpetion{
    
        int lines = matrix.length;
        int columns = vector.length;
        
        Number[] result = new Number[lines];
        
        if(lines != columns){
            throw new InvalidSizeExcpetion("Matrix and vector don't have same size");
        } else {
            for(int i = 0; i < columns; i++){
                Number sum = 0;
                Number aux = 0;
                for(int j = 0; j < lines; j++){
                    aux = NumberOperations.multiplication(matrix[i][j], vector[i]);
                    sum = NumberOperations.summation(sum, aux);
                }
                result[i] = sum;
            }
        }
        
        return result;
    }
    
    @Override
    public Number[][] multiplyMatrices(Number[][] matrixA, Number[][] matrixB){
    
        int lines = matrixA.length;
        int columns = matrixB[0].length;
        
        Number[][] result = new Number[lines][columns];
        
        for(int i = 0; i < lines; i++){
            
        }
        
        return null;
    }
}

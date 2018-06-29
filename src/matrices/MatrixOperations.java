/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;

import exceptions.InvalidSizeExcpetion;

/**
 *
 * @author luis.assulfi
 */
public class MatrixOperations{
    
    public static Number[][] transpose(Number[][] matrix) throws NumberFormatException{
        
        int lines = matrix.length;
        int columns = matrix[0].length;
        
        Number[][] transposeMatrix = new Number[lines][columns];
        
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        
        return transposeMatrix;
    }
    
    public static Number[] multiplyMatrixVector(Number[][] matrix, Number[] vector) 
            throws NumberFormatException, InvalidSizeExcpetion{
    
        int lines = matrix.length;
        int columns = vector.length;
        
        Number[] result = new Number[lines];
        
        if(lines != columns){
            throw new InvalidSizeExcpetion("Matrix and vector don't have same size");
        } else {
            for(int i = 0; i < columns; i++){
                Number sum = 0;
                for(int j = 0; j < lines; j++){
                    if((matrix[i][j] instanceof Integer) && (vector[i] instanceof Integer)){
                        sum += matrix[i][j].intValue() * vector[i].intValue();
                    }
                }
                result[i] = sum;
            }
        }
        
        return result;
    }
    
}

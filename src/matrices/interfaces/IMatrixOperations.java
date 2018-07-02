/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.interfaces;

import exceptions.InvalidSizeExcpetion;

/**
 *
 * @author luis.assulfi
 */
public interface IMatrixOperations {
    
    Number[][] transpose(Number[][] matrix) throws NumberFormatException;
    Number[] multiplyMatrixVector(Number[][] matrix, Number[] vector) throws NumberFormatException, InvalidSizeExcpetion;
    Number[][] multiplyMatrices(Number[][] matrixA, Number[][] matrixB);
}

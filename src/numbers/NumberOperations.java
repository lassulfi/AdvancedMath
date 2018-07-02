/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import exceptions.DivisionByZeroException;

/**
 * Class responsable for mathematical operations with generic numbers
 * @author luis.assulfi
 */
public class NumberOperations {
 
    /**
     * Calculates the multiplication between two numbers
     * @param a
     * @param b
     * @return result of multiplication between a and b
     */
    public static Number multiplication(Number a, Number b){
        if((a instanceof Integer) && (b instanceof Integer)){
            return (a.intValue() * b.intValue());
        }
        if (a instanceof Long && b instanceof Long){
            return (a.longValue() * b.longValue());
        }
        if(a instanceof Float && b instanceof Float){
            return (a.floatValue() * b.floatValue());
        }
        if(a instanceof Double && b instanceof Double){
            return (a.doubleValue() * b.doubleValue());
        }
        return null;
    }
    
    /**
     * Calculates the sum between two numbers
     * @param a
     * @param b
     * @return result of the sum between a and b
     */
    public static Number summation(Number a, Number b){
        if((a instanceof Integer) && (b instanceof Integer)){
            return (a.intValue() + b.intValue());
        }
        if (a instanceof Long && b instanceof Long){
            return (a.longValue() + b.longValue());
        }
        if(a instanceof Float && b instanceof Float){
            return (a.floatValue() + b.floatValue());
        }
        if(a instanceof Double && b instanceof Double){
            return (a.doubleValue() + b.doubleValue());
        }
        return null;
    }
    
    /**
     * Calculates the subtraction between two numbers
     * @param a
     * @param b
     * @return result of the subtraction between a and b
     */
    public static Number subtraction(Number a, Number b){
        if((a instanceof Integer) && (b instanceof Integer)){
            return (a.intValue() - b.intValue());
        }
        if (a instanceof Long && b instanceof Long){
            return (a.longValue() - b.longValue());
        }
        if(a instanceof Float && b instanceof Float){
            return (a.floatValue() - b.floatValue());
        }
        if(a instanceof Double && b instanceof Double){
            return (a.doubleValue() - b.doubleValue());
        }
        return null;
    }
    
    public static Number division(Number a, Number b) throws DivisionByZeroException{
        if((a instanceof Integer) && (b instanceof Integer)){
            if(b.intValue() != 0){
                return (a.intValue() / b.intValue());
            } else {
                throw new DivisionByZeroException("Division by zero");
            }        
        }
        if (a instanceof Long && b instanceof Long){
            if(b.longValue() != 0){
                return (a.longValue() - b.longValue());
            } else {
                throw new DivisionByZeroException("Division by zero");
            }
        }
        if(a instanceof Float && b instanceof Float){
            if(b.floatValue()!= 0){
                return (a.floatValue()- b.floatValue());
            } else {
                throw new DivisionByZeroException("Division by zero");
            }
        }
        if(a instanceof Double && b instanceof Double){
            if(b.doubleValue()!= 0){
                return (a.doubleValue()- b.doubleValue());
            } else {
                throw new DivisionByZeroException("Division by zero");
            }
        }
        return null;
    }
}

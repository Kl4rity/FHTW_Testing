/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zinsrechner;

/**
 *
 * @author cstift
 */
public class Calculator {
    public static double calculate(double startCapital, double interestRate, double time) {       
        double interestFactor = 1.0 + (interestRate/100.0);
        double multiplicator = Math.pow(interestFactor, time);
        
        double result = startCapital * multiplicator;
        
        return result;
    }
}

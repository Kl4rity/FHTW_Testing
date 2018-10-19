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
    public static double calculate(double startCapital, double interestRate, double time) throws Exception {
        
        if(time < 2.0 || time > 40.0){
            throw new Exception("Time should be between 2 and 40 years");
        }
        
        if(startCapital < 2000.0 || startCapital > 100000.0){
            throw new Exception("Starting Capital should be between 2000 and 100000 EUR");
        }
        
        if(interestRate < 0.1 || interestRate > 8.0){
            throw new Exception("Interest rate should be between 0.1 and 8.0 %");
        }
        
        double interestFactor = 1.0 + (interestRate/100.0);
        double multiplicator = Math.pow(interestFactor, time);
        
        double result = startCapital * multiplicator;
        
        return result;
    }
}

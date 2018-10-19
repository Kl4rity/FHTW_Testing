/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import zinsrechner.Calculator;

/**
 *
 * @author cstift
 */
public class CalculatorUnitTest {
    
    @Test
    public void calculatesCorrectlyWithValidInputs() throws Exception {
        double startCapital = 2000; // 3 Fälle - drunter + drin + drüber
        double interestRate = 0.1; // 3 Fälle - drunter + drin + drüber
        double time = 2.0; // 3 Fälle - drunter + drin + drüber
        double expected = 2004.0;
        
        double actual = Calculator.calculate(startCapital, interestRate, time);
        
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void throwsExceptionOnCapitalTooLow(){
    
    }
    
    @Test
    public void throwsExceptionOnCapitalTooHigh(){
    
    }
    
//    @Test
//    public void calculatesWithCapitalInRange(){
//    
//    }
    
    @Test
    public void throwsExceptionOnInterestTooLow(){
        
    }
    
    @Test
    public void throwsExceptionOnInterestTooHigh(){
    
    }
    
//    @Test
//    public void interestWithinRange(){
//    
//    }
    
    @Test
    public void throwsExceptionOnTimeTooLow(){
    
    }
    
    @Test
    public void throwsExceptionOnTimeTooHigh(){
    
    }
    
//    @Test
//    public void timeWithinRange(){
//    
//    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import zinsrechner.Calculator;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.rules.ExpectedException;

/**
 *
 * @author cstift
 */
public class CalculatorUnitTest {
    private double startCapital;
    private double interestRate;
    private double time;
    
    @Rule 
    public ExpectedException thrown= ExpectedException.none();
    
    @Test
    public void calculatesCorrectlyWithValidInputs() throws Exception {
        startCapital = 2000; // 3 Fälle - drunter + drin + drüber
        interestRate = 0.1; // 3 Fälle - drunter + drin + drüber
        time = 2.0; // 3 Fälle - drunter + drin + drüber
        double expected = 2004.0;
        
        double actual = Calculator.calculate(startCapital, interestRate, time);
        
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void throwsExceptionOnCapitalTooLow() throws Exception{
        startCapital = 1999;
    	interestRate = 0.1;
    	time = 2.0;
    	
    	thrown.expect(Exception.class);
	thrown.expectMessage("Starting Capital should be between 2000 and 100000 EUR");
    	
    	Calculator.calculate(startCapital, interestRate, time);
    	fail("Exception expected");
    }
    
    @Test
    public void throwsExceptionOnCapitalTooHigh() throws Exception{
        startCapital = 100001;
        interestRate = 0.1;
    	time = 2.0;
    	
    	thrown.expect(Exception.class);
	thrown.expectMessage("Starting Capital should be between 2000 and 100000 EUR");
    	
    	Calculator.calculate(startCapital, interestRate, time);
    	fail("Exception expected");
    }
    
    @Test
    public void throwsExceptionOnInterestTooLow()  throws Exception{
        startCapital = 5000;
        interestRate = 0.099;
    	time = 2.0;
    	
    	thrown.expect(Exception.class);
	thrown.expectMessage("Interest rate should be between 0.1 and 8.0 %");
    	
    	Calculator.calculate(startCapital, interestRate, time);
    	fail("Exception expected");
    }
    
    @Test
    public void throwsExceptionOnInterestTooHigh()  throws Exception{
        startCapital = 5000;
        interestRate = 8.01;
    	time = 2.0;
    	
    	thrown.expect(Exception.class);
	thrown.expectMessage("Interest rate should be between 0.1 and 8.0 %");
    	
    	Calculator.calculate(startCapital, interestRate, time);
    	fail("Exception expected");    
    }
    
    @Test
    public void throwsExceptionOnTimeTooLow()  throws Exception{
        startCapital = 5000;
        interestRate = 5;
    	time = 1.99;
    	
    	thrown.expect(Exception.class);
	thrown.expectMessage("Time should be between 2 and 40 years");
    	
    	Calculator.calculate(startCapital, interestRate, time);
    	fail("Exception expected");
    }
    
    @Test
    public void throwsExceptionOnTimeTooHigh()  throws Exception{
        startCapital = 5000;
        interestRate = 5;
    	time = 40.1;
    	
    	thrown.expect(Exception.class);
	thrown.expectMessage("Time should be between 2 and 40 years");
    	
    	Calculator.calculate(startCapital, interestRate, time);
    	fail("Exception expected");    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.rules.ExpectedException;
import zinsrechner.Hauptrechner;

/**
 *
 * @author cstift
 */
public class HauptrechnerUnitTest {
    
    private Hauptrechner hauptrechner;
    
    @Rule 
    public ExpectedException thrown= ExpectedException.none();
    
    @Before
    public void setup(){
        hauptrechner = new Hauptrechner();
    }
    
    @After
    public void tearDown(){
        hauptrechner = null;
    }
    
    
    @Test
    public void callsCalculatorInCaseAllFieldsAreSetCorrectly() {
        String expected = "5202.0";
        String actual;
        
        hauptrechner.setFieldStartingCapitalValue(5000);
        hauptrechner.setFieldInterestValue(2);
        hauptrechner.setFieldTimeValue(2);
        
        hauptrechner.pressButton();
        
        actual = hauptrechner.getFieldResultValue();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void throwsExceptionInCaseOfEmptyField(){
        hauptrechner.setFieldStartingCapitalValue(5000);
        hauptrechner.setFieldInterestValue(2);
        
        thrown.expect(Exception.class);
        
        hauptrechner.pressButton();
        
        fail("Exception expected");
    }
    
    @Test
    public void setsResultToErrorIfExceptionIsThrownInCalculator(){
        String expected = "3RR0R";
        String actual = null;
        
        try {
            hauptrechner.pressButton();
        } catch (Exception ex) {
            actual = hauptrechner.getFieldResultValue();
        }
        
        assertEquals(expected, actual);
    }
}

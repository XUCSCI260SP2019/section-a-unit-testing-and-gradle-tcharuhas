package edu.xavier.csci;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest extends Calculator {
    @Test public void testThatTwoIntsCanBeSummedCorrectly() {
        Calculator calc = new Calculator();
        int expected = 20;
        int actual = calc.sum(10,10);
        assertEquals("adding 10 and 10", expected, actual);
    }
    
    @Test public void testThatMoreThanTwoIntsCanBeSummedCorrectly() {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.sum(10,10,10);
        assertEquals("adding 10,10,and 10", expected, actual);
    }
    
}
package com.JUnit.intellij.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void add() {
        float n1 = 1;
        float n2 = 2;
        float expected = 3;
        float actual;
        actual = this.calculator.add(n1, n2);
        assertEquals(expected, actual, 0.000);
    }

    @Test
    public void subtract() {
        float n1 = 3;
        float n2 = 2;
        float expected = 1;
        float actual;
        actual = this.calculator.subtract(n1, n2);
        assertEquals(expected, actual, 0.000);
    }

    @Test
    public void multiply() {
        float n1 = 1;
        float n2 = 2;
        float expected = 2;
        float actual;
        actual = this.calculator.multiply(n1, n2);
        assertEquals(expected, actual, 0.000);
    }

    @Test
    public void divide() {
        float n1 = 2;
        float n2 = 2;
        float expected = 1;
        float actual;
        actual = this.calculator.divide(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
    @Test
    public void par4(){
        float number = 4;
        assertTrue(this.calculator.isEvenNumber(number));
    }
    @Test
    public void par6(){
        float number = 6;
        assertTrue(this.calculator.isEvenNumber(number));
    }
    @Test
    public void par5(){
        float number = 5;
        assertTrue(this.calculator.isEvenNumber(number));
    }
    @Test
    public void par7(){
        float number = 7;
        assertTrue(this.calculator.isEvenNumber(number));
    }

}
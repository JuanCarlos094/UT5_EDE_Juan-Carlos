package com.JUnit.intellij.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest1 {

    private SimpleCalculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void add(){
        System.out.println("Realizando la suma");
        float n1 = 7;
        float n2 = 6;
        float expected = 13;
        float actual;
        actual = this.calculator.add(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
    @Test
    public void subtract(){
        System.out.println("Realizando la resta");
        float n1 = 7;
        float n2 = 6;
        //En este caso, hemos restado 7 y 6, si hubieramos colocado 7 - -6 , la resta habría cambiado
        // y se habría vuelto en una suma, por lo que habría dado 7 - -6= 13.
        //Por eso, en este caso lo he echo con 6.
        float expected = 1;
        float actual;
        actual = this.calculator.subtract(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
    @Test
    public void multiply(){
        System.out.println("Realizando la multiplicación");
        float n1 = 7;
        float n2 = 6;
        float expected = 42;
        float actual;
        actual = this.calculator.multiply(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
    @Test
    public void divide(){
        System.out.println("Realizando la división");
        float n1 = 6;
        float n2 = 2;
        int expected = 3;
        float actual;
        actual = this.calculator.divide(n1, n2);
        assertEquals(expected, actual, 0.000);
        System.out.println("Realizando la división");
         /*n1 = 7;
         n2 = 0;
         expected = 0;
        actual = this.calculator.divide(n1, n2);
        assertEquals(expected, actual, 0.000);*/
    }
}

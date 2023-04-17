package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.sum(5,5));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.subtract(5,5));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(25,calculator.multiply(5,5));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(1,calculator.div(5,5));
    }
}
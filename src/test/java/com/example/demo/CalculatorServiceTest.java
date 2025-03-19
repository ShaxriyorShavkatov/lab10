package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculatorService.add(2, 3));
        assertEquals(0, calculatorService.add(-2, 2));
        assertEquals(-5, calculatorService.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculatorService.subtract(2, 3));
        assertEquals(-4, calculatorService.subtract(-2, 2));
        assertEquals(1, calculatorService.subtract(-2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculatorService.multiply(2, 3));
        assertEquals(-4, calculatorService.multiply(-2, 2));
        assertEquals(6, calculatorService.multiply(-2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculatorService.divide(6, 3), 0.001);
        assertEquals(-2.0, calculatorService.divide(-6, 3), 0.001);
        assertEquals(2.0, calculatorService.divide(-6, -3), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(6, 0);
        });
    }
}


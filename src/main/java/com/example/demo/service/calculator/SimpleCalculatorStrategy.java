package com.example.demo.service.calculator;

import org.springframework.stereotype.Service;

@Service("simpleCalculator")
public class SimpleCalculatorStrategy implements CalculatorStrategy {
    @Override
    public double add(double a, double b) {
        return a + b;
    }
    
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }
    
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}


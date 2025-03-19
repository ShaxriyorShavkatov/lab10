package com.example.demo.service.calculator;

import org.springframework.stereotype.Service;

@Service("scientificCalculator")
public class ScientificCalculatorStrategy implements CalculatorStrategy {
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
    
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public double sqrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
    
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }
    
    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
    
    public double tan(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}


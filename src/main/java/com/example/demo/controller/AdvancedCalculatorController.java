package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.calculator.CalculatorStrategy;
import com.example.demo.service.calculator.ScientificCalculatorStrategy;
import com.example.demo.service.HistoryService;

@RestController
@RequestMapping("/calculator")
public class AdvancedCalculatorController {
    private final CalculatorStrategy simpleCalculator;
    private final ScientificCalculatorStrategy scientificCalculator;
    private final HistoryService historyService;
    
    @Autowired
    public AdvancedCalculatorController(
            @Qualifier("simpleCalculator") CalculatorStrategy simpleCalculator,
            @Qualifier("scientificCalculator") ScientificCalculatorStrategy scientificCalculator,
            HistoryService historyService) {
        this.simpleCalculator = simpleCalculator;
        this.scientificCalculator = scientificCalculator;
        this.historyService = historyService;
    }
    
    @GetMapping("/simple/add")
    public double simpleAdd(@RequestParam double a, @RequestParam double b) {
        double result = simpleCalculator.add(a, b);
        historyService.logCalculation("Simple: " + a + " + " + b + " = " + result);
        return result;
    }
    
    @GetMapping("/scientific/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        double result = scientificCalculator.power(base, exponent);
        historyService.logCalculation("Scientific: " + base + " ^ " + exponent + " = " + result);
        return result;
    }
    
    @GetMapping("/scientific/sqrt")
    public double sqrt(@RequestParam double number) {
        double result = scientificCalculator.sqrt(number);
        historyService.logCalculation("Scientific: sqrt(" + number + ") = " + result);
        return result;
    }
    
    @GetMapping("/scientific/sin")
    public double sin(@RequestParam double angle) {
        double result = scientificCalculator.sin(angle);
        historyService.logCalculation("Scientific: sin(" + angle + "°) = " + result);
        return result;
    }
}


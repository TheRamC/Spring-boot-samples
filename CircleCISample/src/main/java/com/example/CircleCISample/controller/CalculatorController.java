package com.example.CircleCISample.controller;

import com.example.CircleCISample.controller.api.CalculatorApi;
import com.example.CircleCISample.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements CalculatorApi {

    @Autowired
    CalculatorService calculatorService;

    @Override
    public int add(int parameter1, int parameter2) {
        return calculatorService.addition(parameter1,parameter2);
    }

    @Override
    public int subtract(int parameter1, int parameter2) {
        return calculatorService.subtraction(parameter1,parameter2);
    }

    @Override
    public int multiply(int parameter1, int parameter2) {
        return calculatorService.multiplication(parameter1,parameter2);
    }

    @Override
    public int divide(int parameter1, int parameter2) {
        return calculatorService.division(parameter1,parameter2);
    }
}

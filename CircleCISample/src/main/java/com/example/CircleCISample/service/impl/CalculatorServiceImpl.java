package com.example.CircleCISample.service.impl;

import com.example.CircleCISample.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int addition(int parameter1, int parameter2) {
        return parameter1 + parameter2;
    }

    @Override
    public int subtraction(int parameter1, int parameter2) {

        return parameter1 - parameter2;
    }

    @Override
    public int multiplication(int parameter1, int parameter2) {
        return parameter1 * parameter2;
    }

    @Override
    public int division(int parameter1, int parameter2) {
        return parameter1/parameter2;
    }
}

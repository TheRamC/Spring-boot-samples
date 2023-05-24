package com.example.CircleCISample.controller.api;

import org.junit.jupiter.api.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/v1/calculator")
public interface CalculatorApi {


    @GetMapping("/add")
    public int add(@RequestParam(defaultValue = "0") int parameter1, @RequestParam(defaultValue = "0") int parameter2);

    @GetMapping("/subtract")
    public int subtract(@RequestParam(defaultValue = "0") int parameter1, @RequestParam(defaultValue = "0") int parameter2);

    @GetMapping("/multiply")
    public int multiply(@RequestParam(defaultValue = "0") int parameter1, @RequestParam(defaultValue = "0") int parameter2);

    @GetMapping("/divide")
    public int divide(@RequestParam(defaultValue = "0") int parameter1, @RequestParam(defaultValue = "0") int parameter2);

}

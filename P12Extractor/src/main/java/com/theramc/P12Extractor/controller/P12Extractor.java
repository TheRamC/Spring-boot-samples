package com.theramc.P12Extractor.controller;

import com.theramc.P12Extractor.util.P12Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class P12Extractor {

    @Autowired
    P12Utility p12Utility;

    @GetMapping("/isActive")
    public String isActive() {
        return "Welcome To P12 File Extractor!!!";
    }

    @GetMapping("/getDetails")
    public String getP12Details() {
        return p12Utility.loadP12File();
    }


}

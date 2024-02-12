package com.donha.skewer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstRest {

    @GetMapping
    public String teste() {
        return "Hello World";
    }
}

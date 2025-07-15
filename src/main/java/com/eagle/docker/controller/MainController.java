package com.eagle.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MainController {

    @GetMapping
    public String getMessage(){
        return "Hello World to Ganesh Gasain";
    }

    @GetMapping("/1")
    public String getMessageSecond(){
        return "Ganesh Welcome to Jenkins Docker World Second";
    }
}

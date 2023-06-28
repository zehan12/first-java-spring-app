package com.springapp.myFirstSpringApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String hello() {
        return "hola de backend";
    }
}
package com.demo.CrudEjemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api")
public class Apidemo {

    @GetMapping("/hola")
    public String saluda() {return "hola esto es un saludo";}
}

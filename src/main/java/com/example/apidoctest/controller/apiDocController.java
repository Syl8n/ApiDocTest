package com.example.apidoctest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class apiDocController {
    @PostMapping("/api/user")
    public void create(){

    }

    @GetMapping("/api/user/{id}")
    public void view(){

    }

    @PutMapping("/api/user")
    public void edit(){

    }

    @DeleteMapping("/api/user/{id}")
    public void delete(){

    }
}

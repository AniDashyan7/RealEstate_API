package com.example.realestate.implementation.controllers;

import com.example.realestate.api.domain.Apartment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/apartments")
public class ApartmentController {


    @GetMapping("{id}")

    public Apartment findById(@PathVariable Long id ){
    }
}

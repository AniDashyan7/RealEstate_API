package com.example.realestate.api.services;

import com.example.realestate.api.domain.Apartment;
import jakarta.annotation.Nullable;

import java.util.List;

public interface ApartmentService {

    /**
     * Retrieve a specific product object by its id
     *
     * @param id A unique id for the product
     */
    Apartment findById(Long id);

    Apartment findByName(String name);

    List<Apartment> findAll();

    Apartment saveProduct(
            String name,
            Double price,
            String description);

    Apartment updateProduct(
            String name,
            @Nullable Double price,
            @Nullable String description);

    void deleteProduct(Long id);
}

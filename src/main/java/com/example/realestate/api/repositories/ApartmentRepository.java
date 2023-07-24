package com.example.realestate.api.repositories;

import com.example.realestate.api.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApartmentRepository extends JpaRepository<Apartment, Long > {

    Optional<Apartment> findApartmentByCity(String city);
    Optional<Apartment>findApartmentByCityAndPrice(String city, Double price);

    Optional <Apartment>findApartmentByCityAndRooms(String city , Integer rooms);

    Optional <Apartment>findApartmentByCityAndFloor(String city , Integer floor);

    Optional <Apartment>findApartmentByCityAndDescription(String city , String description);

    Optional<Apartment> findApartmentByPrice(Double price);
    Optional<Apartment> findApartmentByPriceAndRooms (Double price, Integer rooms);
    Optional<Apartment> findApartmentByPriceAndFloor(Double price, Integer floor);
    Optional<Apartment> findApartmentByPriceAndDescription(Double price, String description);

    Optional<Apartment> findApartmentByRooms(Integer rooms);

    Optional<Apartment> findApartmentByFloor(Integer floor);
    Optional<Apartment> findApartmentByDescription(String description);
}

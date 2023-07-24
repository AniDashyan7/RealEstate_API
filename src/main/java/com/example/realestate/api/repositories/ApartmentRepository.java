package com.example.realestate.api.repositories;

import com.example.realestate.api.domain.Apartment;
import org.springframework.aop.target.AbstractPrototypeBasedTargetSource;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

    Optional<Apartment>findApartmentByCity(String city);
    Optional<Apartment>findApartmentByCityAndPrice(String city, Double price);
    Optional <Apartment>findApartmentByCityAndRooms(String city , Integer rooms);
    Optional <Apartment>findApartmentByCityAndFloor(String city , Integer floor);
    Optional <Apartment>findApartmentByCityAndDescription(String city , String description);
    Optional<Apartment> findApartmentByPrice(Double price);
    Optional<Apartment> findApartmentByPriceAndRooms (Double price, Integer rooms);
    Optional<Apartment> findApartmentByPriceAndFloor(Double price, Integer floor);
    Optional<Apartment> findApartmentByPriceAndDescription(Double price, String description);
    Optional <Apartment> findApartmentByCityAndPriceAndRoomsAndFloor(String city, Double Price, Integer rooms,Integer floor);
    Optional <Apartment> findApartmentByCityAndPriceAndRoomsAndDescription (String city, Double Price, Integer Rooms, String description);
    Optional <Apartment> findApartmentByCityAndRoomsAndFloorAndDescription (String city, Integer Rooms , Integer Floor, String Description);
    Optional <Apartment> findApartmentByCityAndPriceAndRoomsAndFloorAndDescription (String City, Double Price , Integer Floor, String Description);
    Optional <Apartment> findApartmentByPriceAndRoomsAndFloor(Double Price, Integer Rooms, Integer Floor);
    Optional <Apartment> findApartmentByPriceAndRoomsAndDescription(Double Price, Integer Rooms, String Description);
    Optional<Apartment>findApartmentByRoomsAndFloor(Integer rooms, Integer floor);
    Optional<Apartment>findApartmentByRoomsAndDescription(Integer rooms, String description);
    Optional<Apartment>findApartmentByFloorAndDescription(Integer floor, String description);
    Optional<Apartment>findApartmentByCity_PriceAndRooms(String city, Double price, Integer rooms);
    Optional<Apartment>findApartmentByCity_PriceAndFloor(String city, Double Price, Integer Floor);
    Optional<Apartment>findApartmentByCity_PriceAndDescription(String City, Double price, String description);
    Optional<Apartment>findApartmentByCity_RoomsAndFloor(String city, Integer rooms, Integer floor);
    Optional<Apartment>findByAllParameters(String city, Double price, Integer rooms, Integer floor, String description);
    Optional<Apartment>findApartmentByCity_RoomsAnAndDescription(String City, Integer rooms, String description);
    Optional<Apartment>findApartmentByCity_FloorAndDescription(String city, Integer floor, String Description);
    Optional<Apartment>findApartmentByPrice_FloorAndDescription(Double price, Integer floor, String description);
    Optional<Apartment>findApartmentByRooms_FloorAndDescription(Integer rooms, Integer floor, String description);
    Optional<Apartment> findApartmentByRooms(Integer rooms);
    Optional<Apartment> findApartmentByFloor(Integer floor);
    Optional<Apartment> findApartmentByDescription(String description);
}

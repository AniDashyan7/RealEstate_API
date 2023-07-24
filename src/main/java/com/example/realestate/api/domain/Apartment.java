package com.example.realestate.api.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "price")
    private Double price;

    @Column(name = "rooms")
    private Integer rooms;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "isRenovated")
    private Boolean isRenovated;

    @Column(name = "furniture")
    private Boolean furniture;

    @Column(name = "description")
    private String description;

    @Column(name = "image", length=1000)
    private byte[] image;
}

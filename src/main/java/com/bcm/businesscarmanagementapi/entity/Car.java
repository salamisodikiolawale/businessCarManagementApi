package com.bcm.businesscarmanagementapi.entity;

import com.bcm.businesscarmanagementapi.enumerate.TransportType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity(name = "car")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "licence_plate", nullable = false, length = 11)
    private String lp; // Plaque d'immatriculation lpn-lpl-cin
    @Column(name = "licence_plate_number", nullable = false)
    @Length(min = 3, max = 5)
    private String lpn; //Chiffres de plaque d'immatriculation 4 ou 5 chiffres
    @Column(name = "licence_plate_letters", nullable = false, length = 2)
    private String lpl; //Lettres de plaque d'immatriculation 2 lettres
    @Column(name = "city_identification_number", nullable = false, length = 2)
    private String cin; //Numéro d'identification de la ville 2 chiffres
    @Column(name = "serial_number", nullable = false)
    @Length(min = 16)
    private String serialNumber;
    @Column(name = "transport_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransportType transportType;
    @Column(name = "driver_number", nullable = false, length = 1)
    private int driverNumber;
    @Column(name = "color")
    private String color;
    @ManyToMany
    @JoinTable(name = "driver_car",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "driver_id"))
    private List<Driver> driverList;



}

package com.bcm.businesscarmanagementapi.dto;

import com.bcm.businesscarmanagementapi.enumerate.TransportType;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    @NotBlank
    private String lp; // Plaque d'immatriculation lpn-lpl-cin
    @NotBlank
    private String lpn; //Chiffres de plaque d'immatriculation 4 ou 5 chiffres
    @NotBlank
    private String lpl; //Lettres de plaque d'immatriculation 2 lettres
    @NotBlank
    private String cin; //Numéro d'identification de la ville 2 chiffres
    @NotBlank
    private String serialNumber;
    @NotBlank
    private TransportType transportType;
    @NotBlank
    private int driverNumber;
    private String color;
    private List<DriverDTO> driverList;

}

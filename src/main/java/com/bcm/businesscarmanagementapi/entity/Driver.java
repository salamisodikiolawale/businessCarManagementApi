package com.bcm.businesscarmanagementapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "birthday", nullable = false)
    private Date birthday;
    @Column(name = "experience_Driving_number", nullable = false)
    private int expDrivingNumber;
    @Column(name = "cell_phone", nullable = false)
    private String cellPhone;
    @Column(name = "address", nullable = false)
    private String address;
//    @ManyToMany(mappedBy = "driverList")
    @ManyToMany
    @JoinTable(
            name = "driver_car",
            joinColumns = @JoinColumn(name = "driver_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id"))
    private List<Car> carList;

}

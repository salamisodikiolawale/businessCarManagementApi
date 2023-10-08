package com.bcm.businesscarmanagementapi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DriverDTO {

    private long id;
    @NotBlank(message = "FirstName can't be empty")
    private String firstName;
    @NotBlank(message = "LastName can't be empty")
    private String lastName;
    @NotBlank(message = "Birthday can't be empty")
    private Date birthday;
    @NotBlank(message = "Experience driving number can't be empty")
    private int expDrivingNumber;
    @NotBlank(message = "Cell Phone can't be empty")
    private String cellPhone;
    @NotBlank(message = "Address can't empty")
    private String address;
    private List<Car> carList;
}

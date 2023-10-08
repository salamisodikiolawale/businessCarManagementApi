package com.bcm.businesscarmanagementapi.service;

import com.bcm.businesscarmanagementapi.entity.Driver;
import com.bcm.businesscarmanagementapi.repository.DriverRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public List<Driver> getDriverList(){
        return driverRepository.findAll();
    }
}

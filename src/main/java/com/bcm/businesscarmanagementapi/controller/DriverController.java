package com.bcm.businesscarmanagementapi.controller;

import com.bcm.businesscarmanagementapi.dto.DriverDTO;
import com.bcm.businesscarmanagementapi.entity.Driver;
import com.bcm.businesscarmanagementapi.service.ConverterService;
import com.bcm.businesscarmanagementapi.service.DriverService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
@AllArgsConstructor
public class DriverController {

    private final DriverService driverService;
    private final ConverterService converterService;

    @GetMapping("")
    public List<DriverDTO> getDriverList(){
        List<Driver> driverList = driverService.getDriverList();
        return converterService.convertDriverListToDriverDTOList(driverList);
    }
}

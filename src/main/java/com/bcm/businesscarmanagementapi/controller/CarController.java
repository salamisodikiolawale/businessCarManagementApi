package com.bcm.businesscarmanagementapi.controller;

import com.bcm.businesscarmanagementapi.dto.Car;
import com.bcm.businesscarmanagementapi.service.CarService;
import com.bcm.businesscarmanagementapi.service.ConverterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;
    private final ConverterService converterService;

    @GetMapping("")
    public List<Car> getCarList() throws Exception {
        List<com.bcm.businesscarmanagementapi.entity.Car> carList = carService.getCarList();
        return converterService.convertCarListToCarDTOList(carList);
    }

}

package com.bcm.businesscarmanagementapi.service;

import com.bcm.businesscarmanagementapi.entity.Car;
import com.bcm.businesscarmanagementapi.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getCarList() throws Exception{
        return carRepository.findAll();
    }
}

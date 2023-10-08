package com.bcm.businesscarmanagementapi.service;

import com.bcm.businesscarmanagementapi.dto.Car;
import com.bcm.businesscarmanagementapi.dto.DriverDTO;
import com.bcm.businesscarmanagementapi.entity.Driver;
import com.bcm.businesscarmanagementapi.enumerate.TransportType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ConverterService {

    public List<Car> convertCarListToCarDTOList(List<com.bcm.businesscarmanagementapi.entity.Car> carList) {

        List<Car> carDTOList = new ArrayList<Car>();
        if (carList != null) {
            carList.forEach(car -> {
                Car carDTO = convertCarToCarDTO(car);
                List<DriverDTO> driverDTOList = convertDriverListIntoCarDTOToDriverDTOListIntoDriverDTOList(car);
                carDTO.setDriverList(driverDTOList);
                carDTOList.add(carDTO);
            });
        }
        return carDTOList;
    }

    public List<DriverDTO> convertDriverListToDriverDTOList(List<Driver> driverList) {

        List<DriverDTO> driverDTOList = new ArrayList<DriverDTO>();
        if (driverList != null) {
            driverList.forEach(driver -> {
                DriverDTO driverDTO = convertDriverToDriverDTO(driver);
                List<Car> carList = convertCarListIntoDriverDTOToCarDTOListIntoDriverDTOList(driver);
                driverDTO.setCarList(carList);
                driverDTOList.add(driverDTO);
            });
        }
        return driverDTOList;
    }

    public Car convertCarToCarDTO(com.bcm.businesscarmanagementapi.entity.Car car) {

        if (car == null) {
            return null;
        }
        Car carDTO = new Car();
        carDTO.setId(car.getId());
        carDTO.setLp(car.getLp());
        carDTO.setLpn(car.getLpn());
        carDTO.setLpl(car.getLpl());
        carDTO.setCin(car.getCin());
        carDTO.setSerialNumber(car.getSerialNumber());
        carDTO.setDriverNumber(car.getDriverNumber());
        carDTO.setTransportType(TransportType.valueOf(String.valueOf(car.getTransportType())));
        carDTO.setColor(car.getColor());
        return carDTO;
    }


    public DriverDTO convertDriverToDriverDTO(Driver driver) {

        if (driver == null) {
            return null;
        }

        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setId(driver.getId());
        driverDTO.setFirstName(driver.getFirstName());
        driverDTO.setLastName(driver.getLastName());
        driverDTO.setBirthday(driver.getBirthday());
        driverDTO.setAddress(driver.getAddress());
        driverDTO.setCellPhone(driver.getCellPhone());
        driverDTO.setExpDrivingNumber(driver.getExpDrivingNumber());
        return driverDTO;
    }

    public List<Car> convertCarListIntoDriverDTOToCarDTOListIntoDriverDTOList(Driver driver) {
        List<com.bcm.businesscarmanagementapi.entity.Car> carList = driver.getCarList();
        if (carList == null) {
            return null;
        }
        List<Car> carDTOList = new ArrayList<Car>();
        for (com.bcm.businesscarmanagementapi.entity.Car car : carList) {
            Car carDTO = convertCarToCarDTO(car);
            carDTOList.add(carDTO);
        }
        return  carDTOList;
    }

    public List<DriverDTO> convertDriverListIntoCarDTOToDriverDTOListIntoDriverDTOList(com.bcm.businesscarmanagementapi.entity.Car car) {
        List<Driver> driverList = car.getDriverList();
        if (driverList == null) {
            return null;
        }
        List<DriverDTO> driverDTOList = new ArrayList<DriverDTO>();
        for (Driver driver : driverList) {
            DriverDTO driverDTO = convertDriverToDriverDTO(driver);
            driverDTOList.add(driverDTO);
        }
        return  driverDTOList;
    }
}

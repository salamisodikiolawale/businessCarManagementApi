package com.bcm.businesscarmanagementapi.service;

import com.bcm.businesscarmanagementapi.dto.Car;
import com.bcm.businesscarmanagementapi.enumerate.TransportType;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;

@SpringBootTest
@AutoConfigureMockMvc
@AllArgsConstructor
public class ConverterServiceTest {

    private final MockMvc mockMvc;

    @MockBean
    private final CarService carService;

    public void getCarList_shouldReturnCarList() throws Exception {
        Car car1 = new Car();
        car1.setId(1L);
        car1.setLp("12360-ZK-02");
        car1.setLpn("12360");
        car1.setLpl("ZK");
        car1.setCin("02");
        car1.setSerialNumber("SN123456789012300");
        car1.setTransportType(TransportType.YANGO);
        car1.setDriverNumber(1);
        car1.setColor("YELLOW");

        Car car2 = new Car();
        car2.setId(1L);
        car2.setLp("12361-ZL-03");
        car2.setLpn("12361");
        car2.setLpl("ZL");
        car2.setCin("03");
        car2.setSerialNumber("SN123456789012320");
        car2.setTransportType(TransportType.TAXI_COMPTEUR);
        car2.setDriverNumber(2);
        car2.setColor("GREEN");

        List<Car> carList = Arrays.asList(car1, car2);

        //given(carService.getCarList()).willReturn(carList);
    }
}

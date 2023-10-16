package com.bcm.businesscarmanagementapi.testUnitaire.controller;

import com.bcm.businesscarmanagementapi.controller.CarController;
import com.bcm.businesscarmanagementapi.service.CarService;
import com.bcm.businesscarmanagementapi.service.ConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CarController.class)
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarService carService;

    @MockBean
    private ConverterService converterService;

    public void testGetCarList_shouldReturnCars() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/cars")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}

package com.bcm.businesscarmanagementapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ContactController {

    @GetMapping("contact")
    public String Contact(){
        return "My new contact";
    }
}

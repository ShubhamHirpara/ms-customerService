package com.example.customerserviceapp.rest;

import com.example.customerserviceapp.dto.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerAPI {

    @GetMapping("/get")
    public CustomerDTO getCustomer(){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setFirstName("Mohit");
        return customerDTO;

    }
}

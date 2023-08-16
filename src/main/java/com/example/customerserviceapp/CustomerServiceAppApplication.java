package com.example.customerserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceAppApplication.class, args);
    }

}

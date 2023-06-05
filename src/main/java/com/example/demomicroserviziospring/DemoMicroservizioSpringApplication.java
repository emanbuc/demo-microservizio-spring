package com.example.demomicroserviziospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@EnableAutoConfiguration
public class DemoMicroservizioSpringApplication {

    Logger logger = LoggerFactory.getLogger(DemoMicroservizioSpringApplication.class);

    @RequestMapping("/")
    String home() {
        logger.info("Hello World!");
        return "Hello World!";
    }

    @RequestMapping( path="/status", produces = "application/json")
    StatusResponse status() {
        //json response 200 OK
        return new StatusResponse("OK", "servizio attivo");
    }


    @RequestMapping( path="/metrics", produces = "application/json")
    MetricsResponse metrics() {
        //json response 200 OK
        return new MetricsResponse(10,100, 1000);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroservizioSpringApplication.class, args);
    }

}

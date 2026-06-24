package com.microservice.producerapp.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer-app")
public class ProducerController {

    @Value("${server.port}")
    private String serverPort;

    private Integer requestCount = 0;

    private final String instanceId = java.util.UUID.randomUUID().toString();


    @GetMapping("/info")
    public String getProducerInfo() {
        System.out.println(requestCount++ + " Request recieved at  producer app instance " + serverPort);
        return "Instance served by port :  " + serverPort + " Instance ID : " + instanceId;

    }

}

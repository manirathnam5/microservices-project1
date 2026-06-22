package com.microservice.consumerapp.controller;


import com.microservice.consumerapp.service.RestTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer-api/rest-template")
@RequiredArgsConstructor
public class RestTemplateController {

    //fetch the details from producer controller which is producer

    @Autowired
    public RestTemplateService restTemplateService;

    @GetMapping("/instance-info")
    public String getInstance() {

        return restTemplateService.getInstanceInfo();

    /*    RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/producer-app/info", String.class);
*/
    }

}

package com.microservice.consumerapp.service;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateService {

    private  final RestTemplate restTemplate;

    private static final String PROVIDER_URL="http://localhost:8080/";

    public String getInstanceInfo(){
HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.AUTHORIZATION,"0fd30e4d-99c9-4a20-9ef6-693a0fee583b"  );
        headers.add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE );
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.ALL_VALUE );
        headers.set(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");

        return restTemplate.getForObject(PROVIDER_URL+"producer-app/info",String.class);
    }


}

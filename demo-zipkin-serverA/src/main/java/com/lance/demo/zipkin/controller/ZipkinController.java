package com.lance.demo.zipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by perdonare on 2017/7/5.
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${sleep}")
    private long sleep;
    @Value("${service.b.address}")
    private String bAddress;
    @Value("${service.c.address}")
    private String cAddress;
    @GetMapping("/trace")
    public String trace() throws InterruptedException {
        Thread.sleep(sleep);
        String bValue = restTemplate.getForObject(bAddress, String.class,"name=aValue");
        String cValue = restTemplate.getForObject(cAddress, String.class,"name=aValue");
        return bValue + cValue;
    }
}


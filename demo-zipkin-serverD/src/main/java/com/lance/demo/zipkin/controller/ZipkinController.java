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
    @GetMapping("/trace")
    public String trace(String name) throws InterruptedException {
        Thread.sleep(sleep);
        return name + "dValue";
    }
}


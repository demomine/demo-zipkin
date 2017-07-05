package com.lance.demo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ServerA {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerA.class, args);
    }
}

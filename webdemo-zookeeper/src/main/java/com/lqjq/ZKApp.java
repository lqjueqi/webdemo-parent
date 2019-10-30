package com.lqjq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZKApp {
    @Value("{server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String get(){
        return "hello zk" + serverPort;
    }
    public static void main(String[] args) {
        SpringApplication.run(ZKApp.class,args);
    }
}

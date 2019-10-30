package com.lqjq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return serverPort;
    }
}

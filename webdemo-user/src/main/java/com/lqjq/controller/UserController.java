package com.lqjq.controller;

import com.lqjq.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private MemberApiFeign memberApiFeign;

    @GetMapping("/get")
    public String get(){
        return restTemplate.getForObject("http://webdemo-member/member",String.class);
    }

    @GetMapping("/feignMember")
    public String feignMember(){
       return memberApiFeign.getMember();
    }

}

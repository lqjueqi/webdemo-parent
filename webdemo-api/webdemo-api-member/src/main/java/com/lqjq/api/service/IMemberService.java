package com.lqjq.api.service;

import com.lqjq.ResponseEntity;
import com.lqjq.api.service.com.lqjq.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IMemberService {

    @RequestMapping("/getMember")
    public UserInfo getMember(@RequestParam("name") String name);

    @RequestMapping("/getUserInfo")
    public ResponseEntity getUserInfo();
}

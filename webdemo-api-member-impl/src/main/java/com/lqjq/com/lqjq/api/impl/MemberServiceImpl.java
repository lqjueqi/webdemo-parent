package com.lqjq.com.lqjq.api.impl;

import com.lqjq.ResponseEntity;
import com.lqjq.api.service.IMemberService;
import com.lqjq.api.service.com.lqjq.entity.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements IMemberService {

    @Value("${server.port}")
    private String serverPort;

    @Override
    @RequestMapping("/getMember")
    public UserInfo getMember(@RequestParam("name") String name) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name + serverPort);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    @Override
    public ResponseEntity getUserInfo() {
        return null;
    }
}

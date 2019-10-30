package com.lqjq.api.impl;

import com.lqjq.ResponseEntity;
import com.lqjq.api.IOrderService;
import com.lqjq.api.feign.MemberServiceFeign;
import com.lqjq.api.service.com.lqjq.entity.UserInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/handlerGetMember")
    public String handlerGetMember(@RequestParam("name") String name) {
        UserInfo userInfo = memberServiceFeign.getMember(name);
        return userInfo.toString();
    }

    //默认开启线程池隔离
    @HystrixCommand(fallbackMethod = "handlerGetMemberhystrixFallback")
    @RequestMapping("/handlerGetMemberhystrix")
    public String handlerGetMemberhystrix(@RequestParam("name") String name) {
        UserInfo userInfo = memberServiceFeign.getMember(name);
        System.out.println("handlerGetMemberhystrix线程池：" + Thread.currentThread().getName());
        return userInfo.toString();
    }

    @HystrixCommand(fallbackMethod = "handlerGetMemberhystrixFallback")
    @RequestMapping("/handlerGetMemberhystrix2")
    public String handlerGetMemberhystrix2(@RequestParam("name") String name) {
        UserInfo userInfo = memberServiceFeign.getMember(name);
        System.out.println("handlerGetMemberhystrix线程池：" + Thread.currentThread().getName());
        return userInfo.toString();
    }

    public String handlerGetMemberhystrixFallback(){
        return "服务降级！";
    }

    @RequestMapping("/orderInfo")
    public ResponseEntity orderInfo(){
        ResponseEntity responseEntity=new ResponseEntity();
        responseEntity.setRtCode(200);
        responseEntity.setRtMsg("返回成功！");
        System.out.println("orderInfo线程池：" + Thread.currentThread().getName());
        return responseEntity;
    }

}

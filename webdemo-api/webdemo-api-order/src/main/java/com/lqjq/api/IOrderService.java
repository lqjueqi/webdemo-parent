package com.lqjq.api;

import com.lqjq.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IOrderService {

    @RequestMapping("/handlerGetMember")
    public String handlerGetMember(String name);

    @RequestMapping("/orderInfo")
    public ResponseEntity orderInfo();
}

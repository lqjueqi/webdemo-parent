package com.lqjq.api.fallback;

import com.lqjq.ResponseEntity;
import com.lqjq.api.feign.MemberServiceFeign;
import com.lqjq.api.service.com.lqjq.entity.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceFeignFallback implements MemberServiceFeign {
    @Override
    public UserInfo getMember(String name) {
        return null;
    }

    @Override
    public ResponseEntity getUserInfo() {
        ResponseEntity responseEntity= new ResponseEntity();
        responseEntity.setRtMsg("服务繁忙");
        return responseEntity;
    }
}

package com.lqjq.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "webdemo-member")
public interface MemberApiFeign {

    @GetMapping("/member")
    public String getMember();
}

package com.lqjq.api.feign;

import com.lqjq.api.fallback.MemberServiceFeignFallback;
import com.lqjq.api.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="webdemo-member",fallback = MemberServiceFeignFallback.class )
public interface MemberServiceFeign extends IMemberService {

}

package com.loginshiroservice.loginshiroservice.feignservice;

import com.shiroproject.usershiroservice.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-service")
@Service
public interface UserService {
    @RequestMapping("/gainUser")
    String gainUser(@RequestParam("username") String username);

    @RequestMapping("/gainIdentity")
    String gainIdentity(int id);

    @RequestMapping("/gainAuthority")
    String gainAuthority(int id);

    @RequestMapping("/test")
    String test();
}

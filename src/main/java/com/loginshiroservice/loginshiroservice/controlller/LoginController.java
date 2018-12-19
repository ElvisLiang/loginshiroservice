package com.loginshiroservice.loginshiroservice.controlller;

import com.loginshiroservice.loginshiroservice.feignservice.UserService;
import com.shiroproject.usershiroservice.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        return userService.test();
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username){

         String  commonResult = userService.gainUser(username);
        return  commonResult;
    }


}

package com.yrf.admin.controller;

import com.yrf.admin.bean.User;
import com.yrf.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author YuRuoFan
 * @Date 2022-03-22 10:04
 */
@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-张三";
    }


    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }

    @GetMapping("/ur")
    public User getUserById(@RequestParam("id") Long id){
        return userService.getUserById(id);
    }

}

package com.liao.web;

import com.liao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/14.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping
    public String test() {
        return userService.getUser();
    }
}

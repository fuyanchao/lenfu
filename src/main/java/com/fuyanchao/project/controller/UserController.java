package com.fuyanchao.project.controller;

import com.fuyanchao.project.model.User;
import com.fuyanchao.project.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public List<User> getUserInfo() {
        List<User> users = userService.getUserInfo();
        return users;
    }

    @RequestMapping("addUser")
    public String AddUser() {
        return UserFormat("addUser");
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(User user) {
         userService.add(user);
        logger.trace(user);
        return "Success";
    }
    public  String UserFormat(String action){
        return "/user/"+action;
    }
}

package com.fuyanchao.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(){

        return  UrlFormat("login");
    }
    public String UrlFormat(String action){
        return "/login/"+action;
    }
}

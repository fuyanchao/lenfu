package com.fuyanchao.project.controller;

import com.fuyanchao.project.model.User;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/users")
public class SwaggerController {

    @ApiOperation(value="get all users",notes = "requires noting")
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> list=new ArrayList<User>();
        User user=new User();
        user.setName("fuyanchao");
        user.setAge(28);
        list.add(user);
        User user1=new User();
        user1.setName("zhanglina");
        user1.setAge(26);
        list.add(user1);
        return list;
    }
    @ApiOperation(value = "get user by name",notes = "requeres the name of user")
    @RequestMapping(method = RequestMethod.GET,value = "/{name}")
    public User getUserById(@PathVariable String name){
        User user=new User();
        user.setName(name);
        return  user;
    }
}


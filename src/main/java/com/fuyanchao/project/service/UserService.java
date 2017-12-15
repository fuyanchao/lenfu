package com.fuyanchao.project.service;

import com.fuyanchao.project.mapper.UserMapper;
import com.fuyanchao.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo() {
        List<User> users = userMapper.getUserInfo();
        return users;
    }

    public String add(User user) {
        return userMapper.add(user);
    }
}

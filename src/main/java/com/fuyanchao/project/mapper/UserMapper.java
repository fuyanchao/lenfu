package com.fuyanchao.project.mapper;

import com.fuyanchao.project.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserInfo();
    String add(User user);
}

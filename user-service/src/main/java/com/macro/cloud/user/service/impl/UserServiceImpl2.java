package com.macro.cloud.user.service.impl;

import com.macro.cloud.user.service.UserInterface;
import com.macro.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl2 implements UserInterface<UserService> {
    private UserService userService;

    @Autowired
    @Override
    public void setOrderService(UserService userService) {
        this.userService = userService;
    }
}

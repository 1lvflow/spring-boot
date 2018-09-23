package com.king.controller;

import com.king.model.User;
import com.king.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TW on 2017/10/10.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("find/{id}")
    public User findById(@PathVariable Integer id) {
        User user = userService.findById(id);
        return user;
    }
}

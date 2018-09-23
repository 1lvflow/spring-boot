package com.king.service;

import com.king.dao.UserDao;
import com.king.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TW on 2017/10/10.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findById(Integer id) {

        User user = userDao.findById(id);
        return user;
    }
}

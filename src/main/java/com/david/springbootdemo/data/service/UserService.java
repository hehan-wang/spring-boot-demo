package com.david.springbootdemo.data.service;

import com.david.springbootdemo.data.dao.UserDao;
import com.david.springbootdemo.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author david
 * @since 2022/6/12
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getAll() {
        return userDao.getUser();
    }
}

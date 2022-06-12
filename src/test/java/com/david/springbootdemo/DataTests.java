package com.david.springbootdemo;

import com.david.springbootdemo.data.entity.User;
import com.david.springbootdemo.data.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class DataTests {
    @Autowired
    private UserService userService;

    @Test
    void allUser() {
        List<User> all = userService.getAll();
        System.out.println(all);
    }

}

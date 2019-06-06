package com.example.demo;

import java.nio.ByteBuffer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
        int effect = userService.addUser("test","13900001111","test@test.com");
    }


}

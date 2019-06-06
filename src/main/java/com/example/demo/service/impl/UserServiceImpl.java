package com.example.demo.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.aspect.TransactionLog;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.JsonUtil;
import com.example.demo.util.ServiceContextHolder;

/**
 * @author songdexu
 * @date 2019/5/30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    @TransactionLog
    public int addUser(String userName, String mobile, String email) {
        User user = new User();
        user.setUserName(userName);
        user.setUserMobile(mobile);
        user.setUserEmail(email);
        user.setGmtCreate(LocalDateTime.now());
        user.setGmtModify(LocalDateTime.now());
        long id =  userMapper.insert(user);
        ServiceContextHolder.setTransactionLog(JsonUtil.objectToJson(user));
        user.setId(id);
        return 1;
    }
}

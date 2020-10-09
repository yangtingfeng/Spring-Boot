package com.example.demo.serviceImpl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.domain.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
 
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;
 
    @Override
    public UserBean loginIn(String name) {
        return userMapper.getInfo(name);
    }
}
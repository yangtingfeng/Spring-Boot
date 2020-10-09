package com.example.demo.mapper;

import com.example.demo.domain.UserBean;

public interface UserMapper {
 
    UserBean getInfo(String name);
 
}
package com.example.myproject.project.service;

import com.example.myproject.project.entity.Login;

public interface LoginServiceImpl {
    public int insertLogin(String username,String password,String email);

    int selectLogin(String username,String password);
}

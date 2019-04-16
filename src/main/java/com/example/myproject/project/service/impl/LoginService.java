package com.example.myproject.project.service.impl;

import com.example.myproject.project.dao.LoginMapper;
import com.example.myproject.project.entity.Login;
import com.example.myproject.project.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginService implements LoginServiceImpl {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public int insertLogin(String username, String password, String email) {
        Login login = new Login();
        UUID uuid = UUID.randomUUID();
        login.setUser(username);
        login.setPassword(password);
        login.setPkid(uuid.toString());
        login.setEmail(email);
        int re = loginMapper.insert(login);
        return re;
    }
}

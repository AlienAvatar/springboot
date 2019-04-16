package com.example.myproject.project.dao;

import com.example.myproject.project.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;


public interface LoginMapper {
    int insert(Login record);
}
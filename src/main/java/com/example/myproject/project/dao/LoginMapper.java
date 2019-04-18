package com.example.myproject.project.dao;

import com.example.myproject.project.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;


public interface LoginMapper {
    int insert(Login record);

    @Select("select user from login where user=#{user}")
    Integer selectLoginByUsername(@Param("user") String user);
}
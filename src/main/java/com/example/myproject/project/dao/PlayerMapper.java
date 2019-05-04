package com.example.myproject.project.dao;

import com.example.myproject.project.entity.Player;

import java.util.List;

public interface PlayerMapper {
    int deleteByPrimaryKey(String pkid);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(String pkid);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);

    List<Player> getAllPlayer();
}
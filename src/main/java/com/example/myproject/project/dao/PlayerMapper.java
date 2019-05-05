package com.example.myproject.project.dao;

import com.example.myproject.project.entity.Player;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PlayerMapper {
    int deleteByPrimaryKey(String pkid);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(String pkid);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);

    @Select("select pkid,playerid,playerdop,playerrank from player where herotype=#{herotype}")
    Page<Player> getAllPlayer(@Param("herotype") String herotype);
}
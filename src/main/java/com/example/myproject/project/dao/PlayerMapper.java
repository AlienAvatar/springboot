package com.example.myproject.project.dao;

import com.example.myproject.project.entity.Player;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PlayerMapper {
    int deleteByPrimaryKey(String pkid);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(String pkid);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);

    @Select("select * from player")
    Page<Player> getAllPlayer();

    @Select("select count(*) from player")
    int getCountPlayer();

    List<Player> getPagePlayerList(String page,String PageSize);
}
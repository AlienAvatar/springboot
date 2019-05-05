package com.example.myproject.project.service.impl;

import com.example.myproject.project.dao.PlayerMapper;
import com.example.myproject.project.entity.Player;
import com.example.myproject.project.service.PlayerServiceImpl;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService implements PlayerServiceImpl {

    @Autowired
    private PlayerMapper playerMapper;


    @Override
    public Page<Player> getAllPlayers(String heroType) {
        if(heroType != null && heroType.equals("")){
            heroType = "dva";
        }
        Page<Player> players = playerMapper.getAllPlayer(heroType);
        return players;
    }
}

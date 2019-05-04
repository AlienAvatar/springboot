package com.example.myproject.project.service.impl;

import com.example.myproject.project.dao.PlayerMapper;
import com.example.myproject.project.entity.Player;
import com.example.myproject.project.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlayerService implements PlayerServiceImpl {

    @Autowired
    private PlayerMapper playerMapper;


    @Override
    public List<Player> getAllPlayers() {
        List<Player> players = playerMapper.getAllPlayer();
        return players;
    }
}

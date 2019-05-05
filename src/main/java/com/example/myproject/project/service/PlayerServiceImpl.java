package com.example.myproject.project.service;

import com.example.myproject.project.entity.Player;
import com.github.pagehelper.Page;

public interface PlayerServiceImpl {

    Page<Player> getAllPlayers();

    int getCountPlayers();


}

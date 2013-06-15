package com.fifascore.service;

import com.fifascore.model.Player;

import java.util.List;


public interface PlayerService {
    public List<Player> getAllPlayers();

    public Player addPlayer(final Player player);
}

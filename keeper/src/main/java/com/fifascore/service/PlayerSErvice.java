package com.fifascore.service;

import com.fifascore.model.Player;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
public interface PlayerService {
    public List<Player> getAllPlayers();

    Player addPlayer(final Player player);
}

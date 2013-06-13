package com.fifascore.service;

import com.fifascore.data.PlayerDao;
import com.fifascore.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public List<Player> getAllPlayers() {

        List<Player> list;
        list = playerDao.getAll();
        return list;
    }

    public Player addPlayer(final Player player) {
        return playerDao.persist(player);
    }
}

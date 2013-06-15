package com.fifascore.service;

import com.fifascore.data.PlayerDao;
import com.fifascore.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

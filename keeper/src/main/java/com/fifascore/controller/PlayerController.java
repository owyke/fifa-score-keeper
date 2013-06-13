package com.fifascore.controller;

import com.fifascore.model.Player;
import com.fifascore.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "/player")
    public
    @ResponseBody
    List<Player> getAllAvailablePlayers() {
        List<Player> players = playerService.getAllPlayers();
        return players;
    }

    @RequestMapping(value = "/player", method = RequestMethod.POST)
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player persistedPlayer = playerService.addPlayer(player);
        return new ResponseEntity<Player>(persistedPlayer, HttpStatus.CREATED);
    }
}

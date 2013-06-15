package com.fifascore.controller;

import com.fifascore.model.GameSession;
import com.fifascore.service.GameSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameSessionController {


    @Autowired
    GameSessionService gameSessionService;


    @RequestMapping(value = "session")
    public
    @ResponseBody
    GameSession getCurrentGameSession() {
        GameSession gameSession = gameSessionService.getCurrentGameSession(false);
        return gameSession;
    }

    @RequestMapping(value = "session", method = RequestMethod.POST)
    public ResponseEntity<GameSession> createSession(@RequestBody GameSession session) {
        gameSessionService.addUserSubmittedGameSession(session);
        return new ResponseEntity<GameSession>(session, HttpStatus.CREATED);
    }

    @RequestMapping(value = "session", method = RequestMethod.PUT)
    public ResponseEntity<GameSession> updateSession(@RequestBody GameSession session) {
        gameSessionService.updateSession(session);
        return new ResponseEntity<GameSession>(session, HttpStatus.CREATED);
    }
}

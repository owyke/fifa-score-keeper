package com.fifascore.controller;

import com.fifascore.model.Match;
import com.fifascore.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class MatchController {

    @Autowired
    MatchService matchService;


    @Autowired
    GameSessionController gameSessionController;


    @RequestMapping(value = "match")
    public
    @ResponseBody
    List<Match> getAllMatchesForCurrentSession() {
        List<Match> matches = gameSessionController.getCurrentGameSession().getMatches();
        return matches;
    }

    @RequestMapping(value = "match", method = RequestMethod.POST)
    public ResponseEntity<Match> addMatch(@RequestBody Match match) {
        match.setRegistrationTime(new Date());
        Match persistedMatch = matchService.addMatch(match);
        return new ResponseEntity<Match>(persistedMatch, HttpStatus.CREATED);
    }

    @RequestMapping(value = "match/{matchId}", method = RequestMethod.DELETE)
    public ResponseEntity addMatch(@PathVariable Long matchId) {
        matchService.deleteMatchById(matchId);
        return new ResponseEntity(HttpStatus.OK);
    }


}

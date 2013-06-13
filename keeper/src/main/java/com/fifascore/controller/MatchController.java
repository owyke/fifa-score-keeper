package com.fifascore.controller;

import com.fifascore.model.Match;
import com.fifascore.service.MatchService;
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
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class MatchController {

    @Autowired
    MatchService matchService;


    @RequestMapping(value = "/match")
    public
    @ResponseBody
    List<Match> getAllAvailablePlayers() {
        List<Match> matches = matchService.getAllMatches();
        return matches;
    }

    @RequestMapping(value = "match", method = RequestMethod.POST)
    public ResponseEntity<Match> addMatch(@RequestBody Match match) {
        Match persistedMatch = matchService.addMatch(match);
        return new ResponseEntity<Match>(persistedMatch, HttpStatus.CREATED);
    }
}

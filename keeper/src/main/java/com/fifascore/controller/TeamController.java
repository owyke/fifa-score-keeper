package com.fifascore.controller;

import com.fifascore.model.Team;
import com.fifascore.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/team")
    public
    @ResponseBody
    List<Team> getAllAvailablePlayers() {
        List<Team> teams = teamService.getAllTeams();
        return teams;
    }


}

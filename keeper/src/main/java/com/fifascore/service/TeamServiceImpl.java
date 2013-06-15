package com.fifascore.service;

import com.fifascore.data.TeamDao;
import com.fifascore.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    public List<Team> getAllTeams() {
        return teamDao.getAll();  //To change body of implemented methods use File | Settings | File Templates.
    }
}

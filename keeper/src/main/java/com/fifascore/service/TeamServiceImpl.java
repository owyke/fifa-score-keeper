package com.fifascore.service;

import com.fifascore.data.TeamDao;
import com.fifascore.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    public List<Team> getAllTeams() {
        return teamDao.getAll();  //To change body of implemented methods use File | Settings | File Templates.
    }
}

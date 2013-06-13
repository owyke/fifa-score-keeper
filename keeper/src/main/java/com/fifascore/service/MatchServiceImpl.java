package com.fifascore.service;

import com.fifascore.data.GameSessionDao;
import com.fifascore.data.MatchDao;
import com.fifascore.model.GameSession;
import com.fifascore.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private GameSessionService gameSessionService;

    @Autowired
    private MatchDao matchDao;

    @Autowired
    private GameSessionDao gameSessionDao;

    @Transactional
    public Match addMatch(final Match match, final GameSession gameSession) {

        //matchDao.persist(match);
        gameSession.getMatches().add(match);
        //matchDao.persist(match);
        gameSessionDao.persist(gameSession);

        return match;
    }

    @Transactional
    public Match addMatch(final Match match) {
        List<GameSession> gameSessions = gameSessionService.getCurrentGameSession(true);
        if (gameSessions == null || gameSessions.size() == 0) {
            gameSessions = new ArrayList<GameSession>();
            gameSessions.add(gameSessionService.createNewGameSession(true));
        }
        return addMatch(match, gameSessions.get(0));
    }

    public List<Match> getAllMatches() {
        return matchDao.getAll();
    }


}

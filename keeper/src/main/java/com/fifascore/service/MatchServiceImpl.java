package com.fifascore.service;

import com.fifascore.data.GameSessionDao;
import com.fifascore.data.MatchDao;
import com.fifascore.model.GameSession;
import com.fifascore.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


        gameSession.getMatches().add(match);
        gameSessionDao.persist(gameSession);

        return match;
    }

    @Transactional
    public Match addMatch(final Match match) {
        GameSession gameSession = gameSessionService.getCurrentGameSession(true);
        if (gameSession == null) {
            gameSession = gameSessionService.createNewGameSession(true);
        }
        return addMatch(match, gameSession);
    }

    @Transactional
    public void deleteMatchById(final Long matchId) {
        matchDao.deleteById(matchId);
    }
}

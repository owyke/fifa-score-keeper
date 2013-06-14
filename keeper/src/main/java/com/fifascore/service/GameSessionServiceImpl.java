package com.fifascore.service;

import com.fifascore.data.GameSessionDao;
import com.fifascore.model.GameSession;
import com.fifascore.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-08
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
@Service
public class GameSessionServiceImpl implements GameSessionService {

    @Autowired
    private GameSessionDao gameSessionDao;

    public GameSession getCurrentGameSession(final Boolean createNew) {

        List<GameSession> activeGameSessions = gameSessionDao.getActiveGameSessions();
        return activeGameSessions.get(0);
    }

    @Transactional
    public GameSession addUserSubmittedGameSession(final GameSession session) {
        session.setSessionStarted(new Date());
        gameSessionDao.persist(session);
        return session;
    }

    @Transactional
    public GameSession createNewGameSession(final Boolean closePreviousSessions) {
        GameSession newSession = new GameSession();
        newSession.setSessionStarted(new Date());
        newSession.setMatches(new ArrayList<Match>());
        newSession.setLocation("Unknown");
        return gameSessionDao.persist(newSession);
    }
}

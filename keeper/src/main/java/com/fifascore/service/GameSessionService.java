package com.fifascore.service;

import com.fifascore.model.GameSession;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-08
 * Time: 11:03
 * To change this template use File | Settings | File Templates.
 */
public interface GameSessionService {

    public List<GameSession> getCurrentGameSession(Boolean createNew);

    public GameSession createNewGameSession(final Boolean closePreviousSessions);

}

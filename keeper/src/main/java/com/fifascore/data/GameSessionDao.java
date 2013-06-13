package com.fifascore.data;

import com.fifascore.model.GameSession;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-13
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 */
public interface GameSessionDao extends BaseDao<GameSession> {

    public List<GameSession> getActiveGameSessions();
}

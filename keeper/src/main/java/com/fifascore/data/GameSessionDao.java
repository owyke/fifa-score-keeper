package com.fifascore.data;

import com.fifascore.model.GameSession;

import java.util.List;

public interface GameSessionDao extends BaseDao<GameSession> {

    public List<GameSession> getActiveGameSessions();


}

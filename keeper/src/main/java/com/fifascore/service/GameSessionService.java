package com.fifascore.service;

import com.fifascore.model.GameSession;

public interface GameSessionService {

    public GameSession getCurrentGameSession(final Boolean createNew);

    public GameSession addUserSubmittedGameSession(final GameSession session);

    public GameSession updateSession(final GameSession session);

    public GameSession createNewGameSession(final Boolean closePreviousSessions);

}

package com.fifascore.service;

import com.fifascore.model.GameSession;
import com.fifascore.model.Match;

public interface MatchService {

    public Match addMatch(final Match match, final GameSession gameSession);

    public Match addMatch(final Match match);

    void deleteMatchById(Long idToRemove);
}

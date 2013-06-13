package com.fifascore.service;

import com.fifascore.model.GameSession;
import com.fifascore.model.Match;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
 */
public interface MatchService {

    public Match addMatch(final Match match, final GameSession gameSession);

    public Match addMatch(final Match match);

    public List<Match> getAllMatches();
}

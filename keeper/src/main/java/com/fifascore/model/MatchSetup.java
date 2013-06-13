package com.fifascore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class MatchSetup {

    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    private Player homePlayers;

    @OneToOne
    private Player awayPlayers;

    @OneToOne
    private Team homeTeam;

    @OneToOne
    private Team awayTeam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getHomePlayers() {
        return homePlayers;
    }

    public void setHomePlayers(Player homePlayers) {
        this.homePlayers = homePlayers;
    }

    public Player getAwayPlayers() {
        return awayPlayers;
    }

    public void setAwayPlayers(Player awayPlayers) {
        this.awayPlayers = awayPlayers;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}

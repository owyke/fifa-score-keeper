package com.fifascore.model;

import com.sun.istack.internal.NotNull;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "MATCH_RECORD")
@JsonIgnoreProperties(ignoreUnknown = true) //TODO neccesary since JS sends additinal data, should ba handled with object mapper config instead
public class Match {
    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date registrationTime;

    @NotNull
    private Integer homeGoals;

    @NotNull
    private Integer awayGoals;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "HOME_PLAYER_ID", referencedColumnName = "ID")
    private Player homePlayer;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "AWAY_PLAYER_ID", referencedColumnName = "ID")
    private Player awayPlayer;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "HOME_TEAM_ID", referencedColumnName = "ID")
    private Team homeTeam;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "AWAY_TEAM_ID", referencedColumnName = "ID")
    private Team awayTeam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    public Player getHomePlayer() {
        return homePlayer;
    }

    public void setHomePlayer(Player homePlayers) {
        this.homePlayer = homePlayers;
    }

    public Player getAwayPlayer() {
        return awayPlayer;
    }

    public void setAwayPlayer(Player awayPlayers) {
        this.awayPlayer = awayPlayers;
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

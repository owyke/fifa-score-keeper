package com.fifascore.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "MATCH_RECORD")
public class Match {
    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date registrationTime;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "MATCH_SETUP_ID", referencedColumnName = "ID")
    private MatchSetup setup;

    @NotNull
    private Integer homeGoals;

    @NotNull
    private Integer awayGoals;

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

    public MatchSetup getSetup() {
        return setup;
    }

    public void setSetup(MatchSetup setup) {
        this.setup = setup;
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
}

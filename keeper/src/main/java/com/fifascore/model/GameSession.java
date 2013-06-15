package com.fifascore.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true) //TODO neccesary since JS sends additinal data, should ba handled with object mapper config instead
public class GameSession {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date sessionStarted;

    @Temporal(TemporalType.DATE)
    private Date sessionEnded;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "GAME_SESSION_ID", referencedColumnName = "ID")
    private List<Match> matches;


    private String location;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSessionStarted() {
        return sessionStarted;
    }

    public void setSessionStarted(Date sessionStarted) {
        this.sessionStarted = sessionStarted;
    }

    public Date getSessionEnded() {
        return sessionEnded;
    }

    public void setSessionEnded(Date sessionEnded) {
        this.sessionEnded = sessionEnded;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

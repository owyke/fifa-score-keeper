package com.fifascore.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 18:45
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Team {

    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Column(unique = true)
    String name;

    @NotNull
    Integer rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

package com.fifascore;

import com.fifascore.model.Match;
import com.fifascore.model.Player;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Player p = new Player();
        p.setFirstName("Oskar");
        p.setLastName("Wyke");
        p.setUserName("OhWhy");
        System.out.println(objectMapper.writeValueAsString(p));

        Match m = new Match();
        m.setAwayGoals(1);
        m.setHomeGoals(2);
        m.setRegistrationTime(new Date());
        System.out.println(objectMapper.writeValueAsString(m));
    }
}

package com.stackroute.domain;

import java.sql.SQLOutput;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void casting(){
        System.out.println(this.actor);
    }
}

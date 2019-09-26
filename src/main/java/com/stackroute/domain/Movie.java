package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

public class Movie {
    private Actor actor;
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void casting(){
        System.out.println(this.actor);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Called");
    }


    public void setBeanName(String s) {
        System.out.println("Bean Name set");
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context created");
    }
}


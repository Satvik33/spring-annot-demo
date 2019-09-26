package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor1(){
        return new Actor("KRK", "Male", 50);
    }
    @Bean
    public Actor actor2(){
        return new Actor("Rakhi Sawant", "Female", 45);
    }
    @Bean
    public Actor actor3(){
        return new Actor("Mallika Sherawat", "Female", 40);
    }

    @Bean(name = {"aag101", "aag102"})
    public Movie movie(){
        Movie movie = new Movie(actor3());
        return movie;
    }
}

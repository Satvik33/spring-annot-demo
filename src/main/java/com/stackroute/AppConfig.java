package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor acting(){
        Actor actor = new Actor();
        actor.setName("Batman");
        actor.setGender("Male");
        actor.setAge(43);
        return actor;
    }

    @Bean
    public Movie making(){
        Movie movie = new Movie();
        movie.setActor(acting());
        return movie;
    }
}

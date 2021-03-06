package com.stackroute;
import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor1(){
        return new Actor("Akshay Kumar", "Male", 50);
    }
    @Bean
    public Actor actor2(){
        return new Actor("Salman Khan", "Male", 50);
    }
    @Bean
    public Actor actor3(){
        return new Actor("Priyanka Chopra", "Female", 40);
    }

    @Bean(name = {"Mujhse Shaadi Karogi", "MSK2"})
    public Movie movie(){
        return new Movie(actor2());
    }
    @Bean(initMethod = "start", destroyMethod = "end")
    public BeanLifeCycleDemoBean demoBean(){
        return new BeanLifeCycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemo processorDemo(){
        return new BeanPostProcessorDemo();
    }
}

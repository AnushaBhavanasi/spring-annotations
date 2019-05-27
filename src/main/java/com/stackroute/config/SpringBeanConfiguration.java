package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {
   /* public Actor getActor(){
        Actor actor=new Actor();
        actor.setActorName("latika");
        actor.setActorGender("female");
        actor.setActorAge(20);
        return actor;

    }
    @Bean(name="movie1")
    public Movie getActor2(){
        return new Movie(getActor());
    }*/
   @Bean(name = "movie")
  public Movie getActor1(){
       Actor actor=new Actor("AlluArjun","male",33);
      return new Movie(actor);
    }

    @Bean(name = "movie1")
    @Scope("prototype")
    public Movie getActor2(){
        Actor actor=new Actor("Arjun","male",26);
        return new Movie(actor);
    }
}

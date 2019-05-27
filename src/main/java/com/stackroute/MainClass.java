package com.stackroute;

import com.stackroute.config.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MainConfig.class);
        ctx.refresh();
        Movie movie1 = (Movie) ctx.getBean("movie1");
        System.out.println(movie1);
        Movie movie = (Movie) ctx.getBean("movie");
        System.out.println(movie);
    }
}

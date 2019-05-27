package com.stackroute;

import com.stackroute.config.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(MainConfig.class);
        annotationConfigApplicationContext.refresh();
        //checking the default scope
        Movie movie = (Movie) annotationConfigApplicationContext.getBean("movie");
        //System.out.println(movie);
        Movie movie1 = (Movie) annotationConfigApplicationContext.getBean("movie");
        System.out.println(movie1);
        System.out.println(movie==movie1);
        //checking the scope using prototype
        Movie movie2 = (Movie) annotationConfigApplicationContext.getBean("movie1");
        System.out.println(movie2);
        System.out.println(movie2==movie);

    }
}

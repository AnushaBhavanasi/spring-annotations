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
        Movie movie = (Movie) annotationConfigApplicationContext.getBean("movie");
        System.out.println(movie);

    }
}

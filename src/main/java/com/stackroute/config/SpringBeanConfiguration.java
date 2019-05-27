package com.stackroute.config;

import awareInterface.ApplicationContextAwareDemo;
import awareInterface.BeanFactoryAwareDemo;
import awareInterface.BeanNameAwareDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {
    @Bean(name = "actor")
    public Actor getActor(){
        return new Actor("AlluArjun","male",33);
    }
    @Bean(name="movie")
    public Movie getMovie(){
        return new Movie();
    }
    @Bean(name="applicationContextAwareDemo")
    public ApplicationContextAwareDemo getApplicationContextAwareDemo(){
        return new  ApplicationContextAwareDemo();
    }
    @Bean(name="beanFactoryAwareDemo")
    public BeanFactoryAwareDemo getBeanFactoryAwareDemo(){
        return new BeanFactoryAwareDemo();
    }
    @Bean(name="beanNameAwareDemo")
    public BeanNameAwareDemo getBeanNameAwareDemo(){
        return new BeanNameAwareDemo();
    }


}

package com.springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        // call methods on the bean
        System.out.println("Loaded the bean from conteext file. Workout:" + theCoach.getDailyWorkout());
        
        // close the context
        context.close();

    }

}

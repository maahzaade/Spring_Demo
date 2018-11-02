package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());


        // retrieve bean from spring container
        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCricketCoach.getDailyWorkout());

        //let's call our new method for fortunes
        System.out.println(theCricketCoach.getDailyFortune());

        //Call our new methods to get the literals
        System.out.println(theCricketCoach.getEmailAddress());
        System.out.println(theCricketCoach.getTeam());

        // close the context
        context.close();

    }

    }

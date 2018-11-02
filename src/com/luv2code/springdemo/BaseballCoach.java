package com.luv2code.springdemo;

/**
 * Created by Mahdiye on 10/20/2018.
 */
public class BaseballCoach implements Coach{

    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFotuneServcie) {

        fortuneService = theFotuneServcie;

    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneservice to get a fortune
        return fortuneService.getFortune();
    }
}

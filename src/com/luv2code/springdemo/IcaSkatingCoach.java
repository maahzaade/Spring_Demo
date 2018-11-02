package com.luv2code.springdemo;

public class IcaSkatingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Let's Start to fall down!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

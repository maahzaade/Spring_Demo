package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
     private String extraVar;

    public HappyFortuneService(String extraVar) {
        this.extraVar = extraVar;
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day! " + extraVar;
    }
}

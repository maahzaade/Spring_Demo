package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
    public final int MAX_ELEMENT = 2;
    private String extraVar;
    private String[] dayFortunes;

    public HappyFortuneService(String extraVar) {
        this.extraVar = extraVar;
    }

    @Override
    public String getFortune() {
        int element = (int) ((Math.random()) * (MAX_ELEMENT + 1));

        return dayFortunes[element] + " " + extraVar;

    }

    public void setDayFortunes(String[] inputDayFortunes) {

        this.dayFortunes = inputDayFortunes;
    }
}

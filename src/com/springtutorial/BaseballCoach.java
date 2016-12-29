package com.springtutorial;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes practicing baseball";
    }
}

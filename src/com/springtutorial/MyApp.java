package com.springtutorial;

public class MyApp {

    public static void main(String[] args) {

        // create object
        Coach theCoach = new TrackCoach();
        // use object here
        System.out.println("Coach's workout: " + theCoach.getDailyWorkout());
    }

}

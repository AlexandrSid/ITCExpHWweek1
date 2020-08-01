package com.company.lesson5.humans;

public class Athlete extends Human {
    @Override
    public void fastRun() {
        System.out.println("I will show you what is fast");
    }

    @Override
    public void slowRun() {
        System.out.println("Will run for hours");
    }

    @Override
    public void restSwim() {
        System.out.println("Don't waste my time");
    }

    @Override
    public void resultSwim() {
        System.out.println("I'll be the first");
    }
}

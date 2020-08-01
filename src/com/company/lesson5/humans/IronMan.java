package com.company.lesson5.humans;

public class IronMan extends Human{

    @Override
    public void fastRun() {
        System.out.println("will do it when last mile left");
    }

    @Override
    public void slowRun() {
        System.out.println("Good to get the 42195");
    }

    @Override
    public void restSwim() {
        System.out.println("I'm not resting, I need to swim for 4 km");
    }

    @Override
    public void resultSwim() {
        System.out.println("Slow down to keep your power");
    }
}

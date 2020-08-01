package com.company.lesson5.animals;

public class Hawk extends Bird{
    @Override
    public String getName() {
        return "Hawk";
    }

    @Override
    public void fly() {
        System.out.println("I can fly as a hawk");
    }

    @Override
    public void walk() {
        System.out.println("and walk either");
    }
}

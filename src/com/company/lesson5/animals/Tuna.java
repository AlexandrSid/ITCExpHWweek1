package com.company.lesson5.animals;

public class Tuna extends Fish{
    @Override
    public String getName() {
        return "Hey, I'm not just a stake!";
    }

    @Override
    public void swim() {
        System.out.println("keep up");
    }
}

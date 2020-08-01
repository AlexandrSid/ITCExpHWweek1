package com.company.lesson5.animals;

public class Duck extends Bird implements Swim{
    @Override
    public String getName() {
        return "I'ma dack";
    }

    @Override
    public void fly() {
        System.out.println("can fly");
    }

    @Override
    public void swim() {
        System.out.println("can swim");
    }

    @Override
    public void walk() {
        System.out.println("and walk funny way");
    }
}

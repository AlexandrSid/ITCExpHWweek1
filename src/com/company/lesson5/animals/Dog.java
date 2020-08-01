package com.company.lesson5.animals;

public class Dog extends Animal implements Swim{
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void swim() {
        System.out.println("OK, I will do this");
    }
}

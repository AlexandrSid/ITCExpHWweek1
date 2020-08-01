package com.company.lesson5.animals;

public class Penguin extends Bird implements Swim{
    @Override
    public String getName() {
        return "GO LINUX, GO!";
    }

    @Override
    public void fly() {
        System.out.println("up to few seconds jumping from the cliff");
    }

    @Override
    public void swim() {
        System.out.println("I'm flying in the sea as other birds do in midair");
    }

    @Override
    public void walk() {
        System.out.println("even duck laughing on me");
    }
}

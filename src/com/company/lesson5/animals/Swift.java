package com.company.lesson5.animals;

public class Swift extends Bird{
    @Override
    public String getName() {
        return "black swift";
    }

    @Override
    public void fly() {
        System.out.println("I can fly all day time");
    }

    @Override
    public void walk() {
        System.out.println("not good with this sheet, ask something else");
    }
}

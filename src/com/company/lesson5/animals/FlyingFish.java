package com.company.lesson5.animals;

public class FlyingFish extends Fish implements Fly{
    @Override
    public String getName() {
        return "bul bul";
    }

    @Override
    public void fly() {
        System.out.println("Yupeeee!");
    }

    @Override
    public void swim() {
        System.out.println("swim wim im");
    }
}

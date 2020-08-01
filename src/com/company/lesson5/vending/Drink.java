package com.company.lesson5.vending;

public class Drink {
    private String name;
    private int cost;

    public Drink(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Drink() {//проинициализировал пустыми значениями чтобы не усложнять логику вывода меню обработкой null, ай-ай-ай
        this.cost=0;
        this.name="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

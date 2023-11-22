package ru.java.basic.penkin.hw6;

public class Cat {          // В гитхаб vetka1
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.reduceFood(appetite)) {
            satiety = true;
        }
    }

    public void printSatiety() {
        System.out.println(name + (satiety ? " сытый" : " голоден"));
    }
}

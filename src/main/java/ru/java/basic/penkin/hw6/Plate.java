package ru.java.basic.penkin.hw6;

public class Plate {         // В гитхаб master

    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        int newAmount = currentFood + amount;
        currentFood = Math.min(newAmount, maxFood);
    }

    public boolean reduceFood(int amount) {
        if (currentFood >= amount) {
            currentFood -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getCurrentFood() {
        return currentFood;
    }
}
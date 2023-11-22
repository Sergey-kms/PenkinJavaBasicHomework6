package ru.java.basic.penkin.hw6;

public class Main {          // В гитхаб vetka1

    public static void main(String[] args) {
        Plate plate = new Plate(50);
        plate.addFood(30);

        Cat[] cats = {
                new Cat("Kot Begemot", 20),
                new Cat("Kot Murzik", 35),
                new Cat("Kot Bayun", 15)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.printSatiety();
        }
    }
}

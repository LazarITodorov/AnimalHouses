package com.company;

public class Main {

    public static void main(String[] args) {
            Tiger t = new Tiger();
            Bird b = new Bird();


            AnimalHouse<Tiger> TigerHouse = new AnimalHouse<Tiger>();
            TigerHouse.animal = t;

        AnimalHouse<Bird> BirdHouse = new AnimalHouse<Bird>();
        BirdHouse.animal = b;


    }
}

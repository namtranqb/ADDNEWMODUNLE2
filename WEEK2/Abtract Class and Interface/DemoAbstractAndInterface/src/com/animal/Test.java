package com.animal;

public class Test {
    public static void main(String[] args) {
        Animal wolf = new Dog("Wolf");
        Cat cat = new Cat("AmericanCat");
        Dog dog = new Dog("JapanDog");
        BigDog lion = new BigDog("AfricaDog");
        Dog billBull = new BigDog("EnglandDog");
        BigDog chihuahua = new BigDog("japan");

        wolf.greets();
        cat.greets();
        dog.greets();
        lion.greets();
        billBull.greets(chihuahua);
        lion.greets(dog);
        lion.greets(billBull);

    }
}

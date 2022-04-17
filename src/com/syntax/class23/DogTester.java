package com.syntax.class23;

public class DogTester {

    public static void main(String[] args) {
        //first object
        Dog dog=new Dog();
        System.out.println(dog);

        //second object
        Dog dog2=new Dog("Tommy", "Green", "RedBull",
                12, 25.5);
        System.out.println(dog2);

        //updating values
        dog2.changeInfo("Rocky", "Black");
        System.out.println(dog2);
    }
}

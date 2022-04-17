package com.syntax.class23;

public class Dog {

    String name;
    String color;
    String breed;
    int age;
    double weight;

    //Constructor overloading
    Dog(){
        System.out.println("No argument constructor");
    }

    Dog(String name){
        this.name=name;
    }

    public Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    //method overloading
    void changeInfo(String name, String color){
        this.name=name;
    }

    void changeInfo(String name, String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }

    @Override //-> gives us the values of the fields
    //write toStr -> when we have empty contructor and we
    //make an object and try to syso(line 8 in DogTester Class)
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

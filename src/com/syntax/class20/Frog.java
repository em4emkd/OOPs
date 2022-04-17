package com.syntax.class20;

public class Frog {

    String name;
    String color;
    int age;
    double weight;

    //this() ->not allowed inside methods

    public Frog(String name, String color, int age, double weight) {
        //this.name = name;
        //this.color = color;
        //this.age = age;
        //this() should be first line inside the constructor body
        this(name, color, age);
       // this.weight = weight;
    }

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        weight=10;//no local variable for weight so we don't need "this"
        double weight=20;
    }

    void printInfo(){
        System.out.println(name+" "+" "+color+" "+age+" "+" "+weight);
    }
}

package com.syntax.class20;

public class Parent {
    //private members don't participate in inheritance
    private String name;
    int age;
    protected double weight;
    public String color;

}

class Child extends Parent {
    void printInfo(){
        //System.out.println(name); private fields cannot be shared
        //they are not available for the child class
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }
}

package com.syntax.class23;

public class StaticDemo {

}

class Cat {
    //static fields and static methods belong to the class
    static int numOfLegs=4;
    String name;//instance field part of the obj

    Cat(String name){
        this.name=name;
    }

    public void printInfo(){
        System.out.println(name+numOfLegs);
    }

    public static void print(){ //inside a static method
         //we cannot access the instance fields directly inside static methods

         // System.out.println(name+numOfLegs);

        //we cannot use instance fields with static method

        //System.out.println(name);
        System.out.println(numOfLegs);

    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");

        Cat.print();

        Cat cat2=new Cat("Nutella");

        cat.printInfo();
    }
}
package com.syntax.class19;

public class Car {
    String name;
    String make;
    String color;
    String type;

    Car(String name, String make, String color, String type){
        this.name=name;//whatever value we are taking from the parmeters
        this.make=make;//we are assigning it to the instance var
        this.color=color;
        this.type=type;

    }

    Car(){

    }

    void printCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);

    }


}
//if we have a same local and instance variable java
//java always prefer local var. If we want to instruct
// java to use instance variable we use this keyword
 //this is a special keyword in java
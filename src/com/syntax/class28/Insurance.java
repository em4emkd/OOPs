package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
    getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
    Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the subclasses and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;
    abstract String getQuote();
    abstract String cancelInsurance();
}
class Car extends Insurance {

    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String getQuote() {
        return "get quote method inside car class";
    }
    @Override
    public String cancelInsurance() {
        return "cancel insurance method inside car class";
    }
}
class Pet extends Insurance{

    String petType;
    public Pet(String petType) {
        this.petType = petType;
    }

    @Override
    public String getQuote() {
        return "get quote method inside Pet class";
    }

    @Override
    public String cancelInsurance() {
        return "cancel insurance method inside pet class";
    }
}
class Health extends Insurance{

    @Override
    public String getQuote() {
        return "get quote method inside health class";
    }

    @Override
    public String cancelInsurance() {
        return "cancel insurance method inside health class";
    }
}
class Tester {
    public static void main(String[] args) {

        Car car = new Car("Audi");
        Pet pet = new Pet("dog");
        Health health = new Health();

        ArrayList<String> subclass = new ArrayList<>();
        subclass.add(car.getQuote());
        subclass.add(car.cancelInsurance());
        subclass.add(pet.cancelInsurance());
        subclass.add(pet.getQuote());
        subclass.add(health.cancelInsurance());
        subclass.add(health.getQuote());

        for (int i = 0; i < subclass.size(); i++) {
            System.out.println(subclass.get(i));
        }
        System.out.println("-----------------------");
        for(String s:subclass){
            System.out.println(s);
        }
        System.out.println("-----------------------");
        Iterator it= subclass.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
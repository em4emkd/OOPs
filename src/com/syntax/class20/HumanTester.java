package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {

        Students students=new Students();
        students.name="Gulnar";
        System.out.println(students.name);
        students.printName();
        System.out.println("*******************");

        Principle principle=new Principle();
        principle.name="Tim";
        principle.printName();
        principle.specialParkingSlot=false;
        System.out.println(principle.specialParkingSlot);

    }
}

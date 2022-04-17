package com.syntax.class24;

public class Task3 {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    public static void main(String[] args) {

        Computer[] computers={new Apple(),new HP(), new Dell(), new Lenovo() };
        for(Computer com:computers){
            com.takingNotes();
            com.storingData();
            com.listenToMusic();
        }
    }
}
class Computer {
    double memory;
    int year;

    void takingNotes(){
        System.out.println("Taking Notes");
    }

    void storingData(){
        System.out.println("Play games");
    }

    void listenToMusic(){
        System.out.println("Listen to Music");
    }

}
class Apple extends Computer{

    @Override
    void listenToMusic() {
        System.out.println("Listen to Music using Itunes");
    }

    void storingData(){
        System.out.println("Storing data in Icloud");
    }
}
class Lenovo extends Computer{

    @Override
    void storingData() {
        System.out.println("Storing data in Dropbox");
    }
}
class HP extends Computer{

}
class Dell extends Computer {
    @Override
    void takingNotes(){
        System.out.println("Using OneNote to take notes");
    }
}
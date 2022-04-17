package com.syntax.class20;

public class Task2 {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String bookName;
    double price;

    public Task2() {
        System.out.println("No argument constructor");
    }

    public Task2(String bookName, double price) {
        this();//->call the first constructor as well when you call this constructor
        this.bookName = bookName;
        this.price = price;
        System.out.println("two argument constructor");
    }
}
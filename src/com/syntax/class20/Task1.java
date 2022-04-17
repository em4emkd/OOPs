package com.syntax.class20;

public class Task1 {

    /*
    Write a java class that have 4 constructors with 4 different access
    levels of constructors(private,public,default,protected) and create 4
    objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
    */

    private Task1(){
        System.out.println("private");
    }
    Task1(double a){
        System.out.println("default");
    }
    protected Task1(String a){
        System.out.println("protected");
    }
    public Task1(boolean a){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task1();
        new Task1("haha");
        new Task1(10.2);
        new Task1(false);
    }


}

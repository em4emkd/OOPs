package com.syntax.class23;

public class AlisParent {

    String girlName="Salma";
    double money=100000;

    void marry(){
        System.out.println("Ali you should marry "+girlName);
    }
}
class Ali extends AlisParent {

    String girlName="Rihanna";
    void marry(){
        super.marry();
        System.out.println("But dad i want to marry "+girlName);
    }
}
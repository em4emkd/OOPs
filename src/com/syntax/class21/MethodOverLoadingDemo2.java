package com.syntax.class21;

public class MethodOverLoadingDemo2 {

    void printInfo(String name, int age, double weight){
        System.out.println(name+" "+age+" "+weight);
    }

    void printInfo(int age, String name, double weight){
        System.out.println(name+" "+age+" "+weight);
    }

    void printInfo(double weight, String name, int age ){
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {

        MethodOverLoadingDemo2  methodOverLoadingDemo2=new MethodOverLoadingDemo2();
        methodOverLoadingDemo2.printInfo("Zulfia", 16, 28.0);
    }


}

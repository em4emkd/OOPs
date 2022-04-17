package com.syntax.class28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task1 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
    */

    public static void main(String[] args) {

//        ArrayList<String> cars=new ArrayList<>(Arrays.asList("BMW","Audi,","Honda"));
//        cars.add("Toyota");
//        System.out.println(cars);

        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");

        System.out.println("**************");

        System.out.println(cars);

        System.out.println("**************");

        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("**************");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("**************");
        int i=0;
        while(i< cars.size()){
            System.out.println(cars.get(i));
            i++;
        }

        System.out.println("**************");

        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

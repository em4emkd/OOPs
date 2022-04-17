package com.syntax.class28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetHomework1 {

    //Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.

    public static void main(String[] args) {

        Set<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Turkey");
        countries.add("Germany");

        Iterator it = countries.iterator();
        while(it.hasNext()){
            System.out.println("Retrieve elements using Iterator: "+it.next());
        }
        System.out.println("---------------------------------");
        for(String country:countries){
            System.out.println("Retrieve elements using for each loop: "+country);
        }

    }
}

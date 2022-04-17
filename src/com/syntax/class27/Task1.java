package com.syntax.class27;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */
        ArrayList<String> names=new ArrayList<>();
        names.add("Tim");
        names.add("Cece");
        names.add("John");
        names.add("Cheryl");
        names.add("Amy");

        System.out.println("Is array list empty? "+names.isEmpty());
        System.out.println("Is Amy present in the array list? "+names.contains("Amy"));
        System.out.println(("The size of the array list is "+names.size()));
        System.out.println(names);
    }
}

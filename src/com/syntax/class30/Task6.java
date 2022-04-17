package com.syntax.class30;

import java.util.LinkedHashSet;

public class Task6 {
    /*
    Create the collection that will store single uniques Objects of a
    String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> col = new LinkedHashSet<>();
        col.add("Coffee");
        col.add("Tea");
        col.add("Kombucha");
        col.add("Milk");
        //first way
        for (String c : col) {
            System.out.print(c + " ");
        }
        System.out.println();

        StringBuilder allDrinks= new StringBuilder(" ");
        for (String c : col) {
            allDrinks.append(c);
        }
        System.out.println(allDrinks);

        //second way with help of google
        StringBuilder builder = new StringBuilder();
        for (String c : col) {
            builder.append(c+" ");
        }
        System.out.print(builder);

    }
}

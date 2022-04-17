package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    //new data structure different from ArrayList and LinkedList
    //HashSet doesn't allow duplicate values
    //HashSet is the name of the class
    //HasSet isn't maintaining the insertion order

    public static void main(String[] args) {
        //no duplicates allowed(removed duplicates) and no insertion order
        HashSet<String> fruit=new HashSet<>();

        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);


    }
}

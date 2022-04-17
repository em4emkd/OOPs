package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Onion");
        //list2.add("Pillow");

        System.out.println(groceries.contains("Onion"));
        System.out.println(groceries.containsAll(list2));

        //adding elements in one line
        List<String> produce = Arrays.asList("Apple","Orange","Banana");

    }
}

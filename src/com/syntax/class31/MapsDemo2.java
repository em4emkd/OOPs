package com.syntax.class31;

import com.syntax.class30.MapDemo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        //nesting the data structure

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("potato");
        veggies.add("carrot");
        veggies.add("onion");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");

        //ArrayList<String> -> name of the class
        //this is called nesting of data structures
        //storing a list inside a map
        Map<String, ArrayList<String>> healthFoods = new HashMap<>();
        healthFoods.put("Veggies", veggies);
        healthFoods.put("Fruit", fruit);

        System.out.println(healthFoods);

    }
}

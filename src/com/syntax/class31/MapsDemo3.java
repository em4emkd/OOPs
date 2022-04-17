package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 10.0);
        fruit.put("Orange", 15.0);

        HashMap<String, Double> veggies=new HashMap<>();
        veggies.put("Onion", 12.5);
        veggies.put("Carrot", 10.6);

        ArrayList<HashMap<String,Double>> list = new ArrayList<>();
        list.add(fruit);
        list.add(veggies);
        System.out.println(list);







    }
}

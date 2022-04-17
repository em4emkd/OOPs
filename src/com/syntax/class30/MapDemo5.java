package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        //getting keys and values from a map
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        //to get in map we have a box and inside that bax we have another box that
        //stores the keys and values

        fruitMap.entrySet();//it returns us a set of entries
        System.out.println(fruitMap.entrySet());
        for(Map.Entry<String,Double> entry: fruitMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}

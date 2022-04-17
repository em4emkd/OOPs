package com.syntax.class30;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        //if i want to use the iterator first i need a Set or a Collection than
        //i can use the collection

        Iterator<String> it=fruitMap.keySet().iterator();//get copies of keys and storing them in the iterator

        while(it.hasNext()) {//checks if there are still elements left in the iterator
            String key = it.next();//getting the key from the iterator
            Double value = fruitMap.get(key);//getting the corresponding value from the map by passing the key
            if (key.contains("e") && value >= 20) {
                it.remove();
            }
        }
        System.out.println(fruitMap);
    }
}

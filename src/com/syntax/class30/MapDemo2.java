package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        //keySet returns Set
        Set<String> keys=fruitMap.keySet();//returns all the keys from the Map and stores it in Set
        System.out.println(keys);
        Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);

        //whenever we try to retrieve the keys we have to store them in a Set




    }
}

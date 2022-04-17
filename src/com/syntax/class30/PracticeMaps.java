package com.syntax.class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeMaps {
    public static void main(String[] args) {
//        HashMap<String,Double> fruitMap=new HashMap<>();
//        //fruitMap.put("Apple", 20) //auto casting doesn't work in collections framework and maps
//        fruitMap.put("Apple", 20.0);
//        fruitMap.put("Banana", 10.2);
//        fruitMap.put("Kiwi", 105.2);
//        fruitMap.put("Orange", 16.5);
//        fruitMap.put("Mango", 10.2);
//        fruitMap.put("Banana", 12.5);//duplicate keys are not allowed in maps
//        //duplicate values are allowed; duplicate values are overridden
//
//        System.out.println("Entry Set: "+fruitMap.entrySet());
//        System.out.println("Key Set: "+fruitMap.keySet());
//        System.out.println("Values : "+fruitMap.values());

        HashMap<String, String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String, String> m:map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");

        for(Map.Entry<String, String> m:map.entrySet()){
            if(m.getKey().equals("ONE") || m.getKey().equals("FOUR")){
                continue;
            }
            System.out.println(m.getKey()+" : "+m.getValue());

        }

        List<Map<String, Object>> dataList = new ArrayList<>();


    }
}

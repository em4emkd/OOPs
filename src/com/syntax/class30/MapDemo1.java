package com.syntax.class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
        //fruitMap.put("Apple", 20) //auto casting doesn't work in collections framework and maps
       fruitMap.put("Apple", 20.0);
       fruitMap.put("Banana", 10.2);
       fruitMap.put("Kiwi", 105.2);
       fruitMap.put("Orange", 16.5);
       fruitMap.put("Mango", 10.2);
       fruitMap.put("Banana", 12.5);//duplicate keys are not allowed in maps
        //duplicate values are allowed; duplicate values are overridden

        System.out.println(fruitMap.get("Kiwi")); //to get the price of kiwi
        fruitMap.remove("Mango");//to remove mango
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsKey("Camel"));
        System.out.println(fruitMap.containsValue(20.0));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        System.out.println(fruitMap.replace("Banana", 50.0));
        System.out.println(fruitMap.values());
        System.out.println(fruitMap);
        System.out.println("**************************");
        System.out.println(fruitMap.keySet()); //this would print all keys
        System.out.println(fruitMap.get("Orange"));// get would get the value of the specified key
        System.out.println(fruitMap.values());
        System.out.println(fruitMap.replace("Banana", 50.0));


    }
}

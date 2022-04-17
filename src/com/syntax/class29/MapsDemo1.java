package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;


public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Asghar Nazir");
        names.add("Muhhammad");
        System.out.println(names.get(0));


        HashMap<Integer, String> map = new HashMap<>();
        map.put(12345, "Asghar Nazir");
        map.put(1234567, "Muhhammad");
        System.out.println(map.get(12345));

        HashMap<String,String> groceries = new HashMap<>();
        groceries.put("Lilly","milk, bread");
        groceries.put("Tim","apple, banana");

        System.out.println(groceries.get("Lilly"));
    }
}

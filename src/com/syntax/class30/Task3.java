package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.
        */
        HashMap<Integer, String> bestBuy=new HashMap<>();
        bestBuy.put(12345, "Printer");
        bestBuy.put(12346, "Computer");
        bestBuy.put(12347, "Camera");
        bestBuy.put(12348, "TV");

        Iterator<Map.Entry<Integer, String>>it=bestBuy.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

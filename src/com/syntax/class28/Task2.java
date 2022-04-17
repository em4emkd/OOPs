package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Love");
        arrayList.add("lahore");
        arrayList.add("cake");

        Iterator<String> iterator= arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(arrayList);

        //or
//        arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));
//        System.out.println(arrayList);


    }
}

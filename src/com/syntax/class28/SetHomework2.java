package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetHomework2 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Paris");
        cities.add("Stockholm");
        cities.add("Rome");
        cities.add("Amsterdam");
        cities.add("Prague");
        cities.add("Athens");

        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);

        //replacing iterator with lambda
        cities.removeIf(s -> s.startsWith("A"));
        System.out.println(cities);

    }
}

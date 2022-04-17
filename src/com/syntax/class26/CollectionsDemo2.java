package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");//index 0
        countries.add("Turkey");//index 1
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("Gana");
        countries.add("Eritea");
        countries.add("Afghanistan");

        //get elements by specifying index
        System.out.println(countries.get(3));
        //System.out.println(countries.get(-1)); ->out of bound
        System.out.println(countries);
        //i want a new country at index number 3 so the rest
        //of the elements get shifted
        countries.add(3, "Pakistan");
        System.out.println(countries);
        System.out.println(countries.size());

        countries.remove("Pakistan");//remove an element

        countries.clear();//this method will clear all elements from the list

        System.out.println(countries);
        System.out.println(countries.size());
    }
}

package com.syntax.class28;

import java.sql.Array;
import java.util.*;

public class RemoveDuplicates {
    /*
    How can you remove all duplicates from ArrayList?
     */

    public static void main(String[] args) {
        //ArrayList allows duplicates
        List<String> aList=new ArrayList<>();

        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        //to remove duplicates we can convert ArrayList to HashSet(doesn't allow duplicate values)

//        HashSet<String> s = new HashSet<String>(aList);
//        System.out.println(s);

        LinkedHashSet s=new LinkedHashSet(aList);
        aList.clear();
        aList.addAll(s);
        System.out.println(aList);
    }
}

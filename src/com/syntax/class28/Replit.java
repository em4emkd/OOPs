package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Replit {
    public static void main(String[] args) {
        /*
        Create an ArrayList of type boolean called listA and add below values
        (true, false, false)
        (true, false, false)
        Create another array list call listB and ad all values from List A into it
        Using iterator print all values from ListB 1 by 1
         */
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB=new ArrayList<>();
        listB.addAll(listA);

        Iterator<Boolean> iter=listB.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

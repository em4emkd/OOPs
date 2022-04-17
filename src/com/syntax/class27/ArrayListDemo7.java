package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        //in ArrayList accessing data is super fast, however manipulating data is super slow
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1,100);
        //with array list we move elements

        //Linklist if we need to add many changes
        LinkedList<Integer> numbers=new LinkedList<>();
        //data can be present randomly anywhere;node 0 contains the address of the next node
        //when we add element to the Linkedlist there is no data movement when using linked list
        numbers.add(12);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(1,100);
    }
}

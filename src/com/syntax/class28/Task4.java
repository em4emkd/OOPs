package com.syntax.class28;

import jdk.nashorn.internal.ir.LiteralNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */

    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<>();

        for (int i = 2; i <=500; i+=2) {
            number.add(i);
        }

        Iterator<Integer> iterator=number.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5 ==0){
                iterator.remove();
            }

        }


    }
}

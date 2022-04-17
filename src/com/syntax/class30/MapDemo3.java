package com.syntax.class30;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        fruitMap.values();//return the data in a form of a collection

        Collection<Double> values=fruitMap.values();//hold down the cmd button and left click
        System.out.println(values);

        Iterator<Double> it =values.iterator();
        while(it.hasNext()){
            if(it.next()>=20){
                it.remove();
            }
        }




    }
}

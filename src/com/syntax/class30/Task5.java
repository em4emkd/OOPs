package com.syntax.class30;

import com.sun.javafx.image.IntPixelGetter;

import java.util.*;

public class Task5 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format John Smith=$100000
     */
    public static void main(String[] args) {

        HashMap<String, Integer> map=new HashMap<>();
        map.put("Crystal", 80000);
        map.put("Robert", 90000);
        map.put("Anne", 100000);
        map.put("Cheryl", 115000);

        Integer maxSalary=Collections.max(map.values());
        for(Map.Entry<String, Integer> m:map.entrySet()){
            if(m.getValue()==maxSalary){
                System.out.println(m.getKey()+"="+m.getValue());
            }
        }
        //The below approach is better
        String name=null;
        Integer salary=0;
        for(Map.Entry<String, Integer> m:map.entrySet()){
            if(m.getValue()>salary){
                salary=m.getValue();
                name=m.getKey();
            }
        }
        System.out.println(name+" =$ "+salary);


    }
}

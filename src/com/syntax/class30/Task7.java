package com.syntax.class30;

import java.util.ArrayList;

public class Task7 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);

        int sum=0;
        for(Integer l:list){
            sum+=l;
        }
        System.out.println("The sum of all integers is "+sum);

        //or
        int sum1=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        System.out.println(sum1);

    }
}

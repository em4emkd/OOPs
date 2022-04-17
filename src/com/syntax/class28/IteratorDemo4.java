package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {
    public static void main(String[] args) {
        //remove elements using iterator

        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");

        Iterator<String> iterator=courses.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Java")){
                iterator.remove();
            }
        }
        System.out.println(courses);
    }

    //when we are doing any operations on the list that can change it's size
    //use iterator otherwise we can use loops
}

package com.syntax.class30;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {
    public static void main(String[] args) {

        int[] arr={10, 20, 30};
        //or
        int[] arr2=new int[5];
        arr2[0]=10;
        arr2[1]=10;
        arr2[2]=10;

        List<Integer> list= Arrays.asList(10,20,30);
        //list.add(40); not supported
        //we can do this, however we cannot a lot of methods from collections class

        List<Integer> list2= new ArrayList<>(Arrays.asList(10,20,30));
        list2.add(40);

        //at lest we will be wasting twice the memory using this approach
    }
}

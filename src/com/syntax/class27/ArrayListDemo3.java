package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //we can only call methods on objects

        ArrayList<Boolean> flags=new ArrayList<>();
        flags.add(true);
        flags.add(true);
        flags.add(false);
        flags.add(true);

        System.out.println(flags.contains(false));

    }
}

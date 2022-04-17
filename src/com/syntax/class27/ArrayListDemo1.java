package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numberList=new ArrayList<>();

        Double double1 = new Double(10.5);
        double number = double1.doubleValue();//converting from wrapper class to primitive->called unboxing
        Double number2 = new Double(number);//converting from primitive to wrapper class ->boxing
        Double number3=10.5;//same as this -> Double number2 = new Double(number); ->autoboxing
        Double number4=number3;
        number3=number4;//autoUnboxing

        //same as string as Strings are also classes
        String name=new String("Emilija");
        String name1="Emilija";
    }
}

package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {

        String name="Yazgul";
        String name2="Farah";
        //not scalable if we have to store large amount of data
        //arrays can be good option to tackle this problem

        String[] names={"Yazgul","Andrew"};
        //fixed size, if we make a larger area we would waste memory
        //names[2]="Teyfur";//the size is two so we would get an error+no built in methods to manipulate array
        String[] names2=new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));

        Arrays.toString(names2).contains("Elena");

        //as a solution we use ArrayList
        //<> diamond operator, we specify the dataType inside diamond operator

        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList ->name of the class
        //<> -> diamond operator
        //String -> dataType
        //
        syntaxStudents.add("Dmitry"); //to add data
        syntaxStudents.add("Mike");
        System.out.println(syntaxStudents);


    }
}

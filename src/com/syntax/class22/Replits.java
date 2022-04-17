package com.syntax.class22;

public class Replits {
}

class Main {

//    static String mixString(String s1, String s2) {
//        String returnedString = "";
//        for (int i = 0; i < s1.length(); i++) {
//            returnedString = returnedString + s1.charAt(i) + s2.charAt(i);
//        }
//        return returnedString;
//    }

    static String mixString(String s1, String s2) {

        String newString="";
        for(int i=0; i<s1.length(); i++){
            newString=newString+s1.charAt(i)+s2.charAt(i);
        }
        return newString;
    }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);








    }
}
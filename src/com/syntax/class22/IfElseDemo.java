package com.syntax.class22;

public class IfElseDemo {
    public static void main(String[] args) {

        int number=10;
       // number>10?System.out.println("Num is larger"):System.out.println("Num is smaller");
        //with this shortcut we must return something we cannot print

    }
    int maxNumber(int num1, int num2){
//        if(num1>num2){
//            return num1;
//        } else {
//            return num2;
//        }

       int maxNum= num1>num2?num1:num2;//this is called turnary operator
       return maxNum;
       //if num1>num2 it will return num1 else num2
        //using the shorter way we can assign it to a variable
        //and store the results example maxNum
    }

}

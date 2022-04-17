package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {

        LinkedList<Integer> primeNumbers=new LinkedList<>();



    }   int inputNumber=0;
        static boolean checkForPrime() {
            int inputNumber=0;
            for(int i=0; i<=100; i++) {
                inputNumber++;
            }
            boolean isItPrime = true;

            if(inputNumber<= 1) {
                isItPrime = false;
                return isItPrime;
            } else {
                for (int i = 2; i<=inputNumber/2; i++){
                    if ((inputNumber % i) == 0){
                        boolean IsItPrime = false;
                        break;
                    }
                }
                return isItPrime;
            }
    }
}

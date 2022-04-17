package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*
        How would handle InputMismatchException? Input Mismatch
        Exception when user enters mismatch value then programmer expected.
         */
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter the correct type of data");
        }
    }

}

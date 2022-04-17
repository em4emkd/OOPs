package com.syntax.class16;

public class Task05 {

    /*How would you check if String is palindrome or not?
    aba=> true
    Abbc =>false
     */

    String revString(String r){
        StringBuilder s=new StringBuilder(r);
        return s.reverse().toString();
    }

    Boolean isPalindrome(String str){
        if(str.equals(revString(str))){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Task05 obj=new Task05();
        System.out.println(obj.isPalindrome("aba"));
        System.out.println(obj.isPalindrome("Abba"));
    }












}

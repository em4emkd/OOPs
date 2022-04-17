package com.syntax.class16;

public class Task5 {

    /*How would you check if String is palindrome or not?
    aba=> true
    Abbc =>false
     */

    boolean isPalindrome(String str){
        String newStr="";
        for(int i=str.length()-1; i>=0; i--){
            newStr+=str.charAt(i);
        }
        if(newStr.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Task5 o=new Task5();
        System.out.println(o.isPalindrome("aba"));
    }


}

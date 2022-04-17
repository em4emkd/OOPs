package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        /*
         How would you reverse a String word by word? for example
         input=>This is sentence i want to reverse
         output=>sihT si ecnetnes i tnaw ot esrever
         */

        String s="This is a sentence i want to reverse";

        String[] words=s.split(" ");

        String revSentence="";
        for (int i = words.length-1; i >=0 ; i--) {
           revSentence+=words[i]+" ";
        }
        System.out.println(revSentence);

        StringBuilder revWords=new StringBuilder(revSentence);
        System.out.println(revWords.reverse().toString().trim());











    }
}

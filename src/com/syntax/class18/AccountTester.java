package com.syntax.class18;

public class AccountTester {

    public static void main(String[] args) {

        Account acct=new Account();

       // System.out.println(acct.userName);
        System.out.println(acct.accountNumber);
       // System.out.println(acct.balance);
       // System.out.println(acct.passWord);
        /*
        accessing a field directly is different from acessing
        the same field with
        methods having different access modifier
         */



        //acct.printUsername();//private access can not be accessed
        acct.printAccountNumber();
        acct.printBalance();
        acct.printPassword();



    }
}

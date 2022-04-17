package com.syntax.class18;

public class Account {

    private String userName="Teyfur";
    private String passWord="Admin";
    public String accountNumber="123456";
    private double balance=-1500;

    private void printUsername(){
        System.out.println(userName);
    }

    protected void printPassword(){
        System.out.println(passWord);
    }

    void printBalance(){
        System.out.println(passWord);
    }

    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account acct=new Account();

        System.out.println(acct.userName);;
        System.out.println(acct.accountNumber);
        System.out.println(acct.balance);
        System.out.println(acct.passWord);

        acct.printUsername();
        acct.printAccountNumber();
        acct.printBalance();
        acct.printPassword();



    }


}

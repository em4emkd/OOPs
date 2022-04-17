package com.syntax.class25;

public class BankAccount {
    //encapsulation
    /*
      1) make variables private
      2)
      3)
     */
    private double balance=1235;
    private String userName="Habib";
    private String password="Habib123";

    void printBalance(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            System.out.println(balance);
        } else {
            System.out.println(-1);
        }
    }
    //created this using getter and setter
    public double getBalance() {
        return balance;
    }
    //created this using getter and setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //created this using getter and setter
    public String getUserName() {
        return userName;
    }
    //created this using getter and setter
    public void setUserName(String userName) {
        this.userName = userName;
    }
    //created this using getter and setter
    public String getPassword() {
        return password;
    }
    //created this using getter and setter
    public void setPassword(String password) {
        this.password = password;
    }
}
class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.printBalance("Habib", "hab");
        account.printBalance("Habib", "Habib123");

    }
}

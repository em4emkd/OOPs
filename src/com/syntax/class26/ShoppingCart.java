package com.syntax.class26;

import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import com.syntax.class25.ChromeDriver;
import com.syntax.class25.WebDriver;

public class ShoppingCart {
//Example for Encapsulation
    private double originalPrice=100; //1) we need to make the fields private so no one can access them
    private double discount=.15;

    //2) we set up getter and setter + if statement
    //setter methods set the value
    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        } else {
            System.out.println("Can't have that much discount");
        }
    }

    //3)getter method to access the value
    public double getDiscount(){
        return discount;
    }

    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }
}
class ShoppingCartTester {
    public static void main(String[] args) {

        ShoppingCart shoppingCart=new ShoppingCart();
        //shoppingCart.originalPrice=100;
        shoppingCart.calculatePrice();
        //when we don't protect the data of the classes
        //we can change the discount
        //shoppingCart.discount=.20;
        //now the discount is 20% instead of 15%
        //this is why we should use encapsulation
        shoppingCart.calculatePrice();
        System.out.println(shoppingCart.getDiscount());

        //off topic example->web driver is interface
        WebDriver webDriver=new ChromeDriver();

    }
}

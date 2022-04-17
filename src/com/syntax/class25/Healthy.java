package com.syntax.class25;

public interface Healthy {
    void Healthy();


}
interface Portable {
    void canCarry();
}
interface Eatable {
    void eat();

}
class Orange implements Healthy, Portable,Eatable {
    //i want to say that Orange is healthy, eatable and i must provide
    //implementation for these methods and use the keyword implements

    @Override
    public void Healthy() {
        System.out.println("Orange is healthy to eat");
    }

    @Override
    public void canCarry() {
        System.out.println("we can carry orange easly");
    }

    @Override
    public void eat() {
        System.out.println("we can eat orange");
    }
}
class Laptop implements Portable {

    @Override
    public void canCarry() {
        System.out.println("we can carry laptop easly");
    }
}
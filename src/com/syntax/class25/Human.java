package com.syntax.class25;

public interface Human {

    //public static final redundant because by default all variable are
    //public static final in interfaces
    // we cannot create an obj from interfaces
    //fields are always public and static in interfaces

    //static final int legs=2;
    int legs=2;

    //public abstract void walk();
    void walk();
    static void  printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default methods are there for functional programming");
    }

}
interface LivingBeing {
    static void printLegs(){
        System.out.println("I can walk");
    }
}
class Maha implements Human, LivingBeing {
    //with interfaces, we don't extend we implement(keyword: implement)
    //we must provide implementation vof the walk mehotd in this example
    //instance fields and constructors are not allowed in interfaces

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}

class HumanTester {
    public static void main(String[] args) {

        Maha maha=new Maha();
        maha.walk();
        // maha.printLegs()->not possible
        Human.printLegs();
        // static method can only be called using interface name
        LivingBeing.printLegs();
    }
}

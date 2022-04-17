package com.syntax.class23;

public class Car {

    void start(){
        System.out.println("Use keys to start me");
    }

    void stop(){
        System.out.println("Use breaks to stop me");
    }

    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car {

    void start(){
        System.out.println("start me with button");
    }
    void stop(){
        System.out.println("can use breaks or i can autoBreak");
    }
    void park(){
        System.out.println("use parking sensors to park me");
    }

}
class Tesla extends Car{

    void start(){
        System.out.println("start me with App or remote");
    }
    void stop(){
        System.out.println("can use breaks or i can autoBreak");
    }
    void park(){
        System.out.println("use parking sensors to  i can auto park");
    }

}

class Suzuki extends Car{

    void start(){
        System.out.println("push me to start");
    }
    void stop(){
        System.out.println("i lost my breaks and tires on the way");
    }
}
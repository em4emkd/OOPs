package com.syntax.class25;

public interface MoveAble {
    void move();
}
interface DriveAble {
    void drive();
}
interface Car extends DriveAble,MoveAble{

}
class BMW implements Car {
    @Override
    public void move() {
        System.out.println("we can move the BMW");
    }

    @Override
    public void drive() {
        System.out.println("we can drive the BMW");
    }
}
class CarTester {
    public static void main(String[] args) {
        Car car=new BMW();
        DriveAble driveAble=new BMW();
        driveAble.drive();

    }

}


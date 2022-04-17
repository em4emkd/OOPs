package com.syntax.class21;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
    ->> A = P*R*R
     */

    double radius;

    public Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape{
    double p=3.14;

    public Circle(double radius) {
        super(radius);
    }

//    public double areaOfCircle(){
//        return p*radius*radius;
//    }

    void areaOfCircle(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
}
class TestCode{

    public static void main(String[] args) {
        Circle calculate=new Circle(5);
        calculate.areaOfCircle();
    }
}
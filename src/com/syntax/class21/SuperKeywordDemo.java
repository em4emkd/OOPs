package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();

    }
}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am grandpa");
    }
}

class Parent extends GrandParent{
    String color="Black";
    void printInfo(){
        System.out.println("I am Parent");
    }
}

class Child extends Parent{
    //same color property in here
    String color="Red";//prints red and overwrite the child color

    void printInfo(){
        System.out.println("I am Child");
    }

    void printColor(){
        String color="Green";//local variable is preferred
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(this.color);//to get the instance var, parent var
    }


}

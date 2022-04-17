package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;

    ToStringDemo(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override //this object class is parent to all classes
    public String toString() {
        return name+" "+age;
    }


    public static void main(String[] args) {

        ToStringDemo toStringDemo=new ToStringDemo("Mr. A", 10);
        System.out.println(toStringDemo);//output: ToStringDemo@1540e19d
        //when we print object we get nonsense

        System.out.println(toStringDemo.toString());//getClass().getName()






    }
}

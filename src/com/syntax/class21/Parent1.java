package com.syntax.class21;

public class Parent1 {

    String name="Parent";
    void printName(){

        System.out.println(name);
    }
}
class Child1 extends Parent1 {
    String name="Parent";
    void printName(){
        String name="Teyfuring";
        System.out.println(name);//first name is looking for a local
        System.out.println(this.name);//variable than it checks the same class
        System.out.println(super.name);//if var is not present it would check if the class extends and
                            // check the parent class for
    }                       //priority given to local var

//super keyword even if there is local variable bring me tha value of the
    //instance variable


}
class ParentTester{
    public static void main(String[] args){

        Child1 child1=new Child1();
        child1.printName();

    }
}
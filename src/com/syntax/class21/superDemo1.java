package com.syntax.class21;

public class superDemo1 {

}

class AAA{
    AAA(){

    }

}
class BBB{

    String name;
    BBB(){

    }
    BBB(String name){
        this();//call construcotr inside constructor
        //super()
    //super()to call first constructor but we can't have this() and super()
        //inside the same construcotr
        this.name=name;

    }
}
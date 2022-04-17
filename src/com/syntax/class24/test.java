package com.syntax.class24;

public class test {
}
class Main {
    public static void main(String[] args){



    }

}
abstract class Tea {

    String teaType;

    Tea(String teaType){
        this.teaType=teaType;
    }

    abstract void addSugar(int numOfSpoons);

}
class LemonTea extends Tea {


    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar(int numOfSpoons){

    }

}
class ChaiTea extends Tea {

    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar(int numOfSpoons) {

    }
}




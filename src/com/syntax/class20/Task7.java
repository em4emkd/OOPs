package com.syntax.class20;

public class Task7 {
    /* Task 9 in github
    Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes
     */

    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Teyfur";
        mathTeacher.teachCalculus();
    }
}

class TeacherA{
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }
}

class MathTeacher extends TeacherA{
    boolean canTeachTrigonometry=true;
    void teachCalculus(){
        System.out.println("Teaching Calculus");
    }
}
class ChemistryTeacher extends TeacherA{
    boolean canTeachAtoms=true;
    void teachChemistry(){
        System.out.println("Teaching Chemistry");
    }
}

class PianoTeacher extends TeacherA{
    void teachPiano(){
        System.out.println("Teaching Piano");
    }
}
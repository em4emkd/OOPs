package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHomework3 {
    /*
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
    */
}
class Students {

     String name;
     int studentID;

    public Students(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }

    public static void main(String[] args) {

        Set<Students> students = new HashSet<>();

        students.add(new Students("John", 12345));
        students.add(new Students("Aimee", 12346));
        students.add(new Students("Anne", 12347));
        students.add(new Students("Joelle", 12348));
        students.add(new Students("Maria", 12349));

       for(Students s:students){
           System.out.println("Student name: "+s.name);
       }

    }
}


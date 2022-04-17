package com.syntax.class19;

public class Task2 {
    /*
    Write a java Class Students that have a constructor
    which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
     */
    String name;
    double mathGrade;
    double scienceGrade;
    double historyGrade;

    Task2(String name, double mathGrade, double scienceGrade, double historyGrade){
        this.name=name;
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
        this.historyGrade=historyGrade;

    }

    void avgGrade(){
        double avrGrade=(mathGrade+scienceGrade+historyGrade)/3;
        System.out.println(avrGrade);
    }

}

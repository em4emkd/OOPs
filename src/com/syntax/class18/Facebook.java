package com.syntax.class18;

public class Facebook {


    private String userName;
    private String password;
    private int age;

    void setAge(int personAge) {
        if (personAge > 13 && personAge < 120) {
            age = personAge;
        } else {
            System.out.println("Not " +
                    "allowed its not a Horse");
        }


    }
}

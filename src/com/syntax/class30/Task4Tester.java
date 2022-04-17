package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {

        TreeMap<String, Person> personTreeMap=new TreeMap<>();
        personTreeMap.put("a", new Person("Asghar", "", 42, 150000 ));
        personTreeMap.put("b", new Person("Guldan", "", 25, 140000 ));
        personTreeMap.put("c", new Person("Cece", "", 35, 130000 ));
        personTreeMap.put("d", new Person("Adina", "", 32, 100000 ));

        for(Map.Entry<String,Person> p: personTreeMap.entrySet()){
            System.out.println(p);
        }
    }
}

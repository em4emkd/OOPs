package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {

        //store the path inside variable; this is the location of the file we want to read
        //String path="Files/Config.properties";->getting the file from intellij
        String path="/Users/Emilija/Desktop/untitled folder/Config.properties";//getting the file from the computer

        //to navigate to the location/path
        FileInputStream fileInputStream =  new FileInputStream(path);

        //we need special class to read the file
        //special class that knows how to read the .properties file
        Properties properties = new Properties();

        //method on properties class that will read and store the information
        //loading all the data from the file to properties object
        properties.load(fileInputStream);


        System.out.println(properties.get("username"));////prints teyfur from the Config file
        System.out.println(properties.get("password"));


    }
}

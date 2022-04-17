package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo3 {
    public static void main(String[] args) throws IOException {

        String path="/Users/Emilija/Desktop/untitled folder/Trump";

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties =new Properties();
        properties.put("IsCrazy", "false" );
        properties.put("IsRich", "true" );
        properties.store(fileOutputStream, "Added some new fields");




    }
}

package com.syntax.class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    /**
     * Create a property file to store following configurations:
     * browser=chrome
     * url=https://facebook.com
     * username
     * password
     * Read file and extract values of browser & url
     */
    public static void main(String[] args) throws IOException {
        String path = "/Users/Emilija/Desktop/untitled folder/facebook.properties";
        FileOutputStream fileOnputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("Browser", "Chrome");
        properties.put("URL", "https://facebook.com");
        properties.put("Username", "emi");
        properties.put("password", "pas123!");
        properties.store(fileOnputStream, "FB login");
    }


}

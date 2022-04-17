package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */

    public static void main(String[] args) {
        HashMap<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Oracle");
        building.put(4, "Microsoft");
        building.put(5, "Spotify");
        building.put(4, "Youtube");
        building.put(7, "Syntax");

        System.out.println(building.size());
        //size is 6-even though i have 7 entries due to havaing duplicate keys
        building.replace(4, "AES");
        System.out.println("After replacing company on 4th floor "+building);
        building.remove(7);
        System.out.println("After removing company on 7th floor "+building);
    }


}

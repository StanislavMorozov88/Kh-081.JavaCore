package com.softserve.lesson10.homeTask;

import java.util.*;

public class HomeTask2 {

    public static void main(String[] args) {
        // Making map
       Map<String, String> personMap = new HashMap();
       personMap.put("Smith", "John");
       personMap.put("Naret", "Bob");
       personMap.put("Colt", "Mark");
       personMap.put("Mull", "Will");
       personMap.put("Stark", "John");
       personMap.put("Barateon", "Grace");
       personMap.put("Greyjoy", "Teon");
       personMap.put("Lanister", "Tirion");
       personMap.put("Targarien", "Dan");
       personMap.put("Blume", "Chris");

        System.out.println(personMap);

        //Tried to copy map
        HashMap<String, String> personMap1 = (HashMap<String, String>) ((HashMap<String, String>) personMap).clone();

        //making list for iteraor
        Collection<String> mapValues = personMap.values();

        System.out.println(personMap1);

        //removing all except John
        for(Iterator<String> itr = mapValues.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(mapValues, itr.next()) < 2)
            {
                itr.remove();
            }
        }
        System.out.println(mapValues);

        //removing only john
        String removeValue = "John";
        String removalKey = null;


        for (Map.Entry<String, String> entry : personMap1.entrySet()) {
            if (removeValue.equals(entry.getValue())) {
                removalKey = entry.getKey();
                break;
            }
        }

        if (removalKey != null) {
            personMap1.remove(removalKey);
        }

        System.out.println(personMap1);

    }
}

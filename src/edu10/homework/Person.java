package edu10.homework;

import java.util.*;

public class Person {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Brenandan", "Fraser");
        personMap.put("Will", "Smith");
        personMap.put("Anthony", "Hopkins");
        personMap.put("Joaquin", "Phoenix");
        personMap.put("Rami", "Malek");
        personMap.put("Garry", "Oldman");
        personMap.put("Casey", "Affleck");
        personMap.put("Leonardo", "DiCaprio");
        personMap.put("Eddie", "Redmayne");
        personMap.put("Matthew", "McConaughey");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getValue() + ", First Name: " + entry.getKey());
        }

        Set<String> firstNames = new HashSet<String>(personMap.values());
        if (firstNames.size() < personMap.size()) {
            System.out.println("There are at least two persons with the same firstName.");
        } else {
            System.out.println("There are no persons with the same firstName.");
        }

        String firstNameToRemove = "Orest";
        for (Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstNameToRemove)) {
                iterator.remove();
            }
        }
        System.out.println("After removing " + firstNameToRemove + ": " + personMap);
    }
}

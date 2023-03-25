package edu10.homework;
import java.sql.SQLOutput;
import java.util.*;

public class task2 {
    public static void main(String[] args) {

        Map <String, String> personMap = new HashMap<>();

        personMap.put("Fedoriv", "Andrii");
        personMap.put("Dovbyk", "Andrii");
        personMap.put("Kozachenko", "Svitlana");
        personMap.put("Bosh", "Dmytro");
        personMap.put("Tychyna", "Pavlo");
        personMap.put("Shevchenko", "Olena");
        personMap.put("Harmash", "Olena");
        personMap.put("Piatov", "Oleksii");
        personMap.put("Lunin", "Maksym");
        personMap.put("Aliiev", "Ruslan");

        System.out.println("personMap" + personMap);

        List<String> list = new ArrayList<>();
        for(Map.Entry<String, String> entry: personMap.entrySet()){
            list.addAll(Collections.singleton(entry.getValue()));
        }

        List<String> listNameDuplicates = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(Objects.equals(list.get(i), list.get(j))){
                    listNameDuplicates.add(list.get(j));
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("Name duplicates: " + listNameDuplicates);


        String name = "Maksym";
         for (Map.Entry<String, String> entry : personMap.entrySet()){
           if(Objects.equals(name, entry.getValue())){
               personMap.remove(entry.getKey());
           }
        }
        System.out.println("----------------------");
        System.out.println("PersonMap after removed Maksym:" + personMap);














    }
}

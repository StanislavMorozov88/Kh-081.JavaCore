package edu08.practical;

import java.sql.SQLOutput;

public class task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Departament departament1 = new Departament("Dep#1",
                new Departament.Address("Kyiv", "Shevchenko", 25));

        //department2 is copy of department1
        Departament departament2 = (Departament) departament1.clone();

        //change city for department2
        departament2.getAddress().setCity("Kharkiv");

        System.out.println("Inforamtion about departament1: " + departament1);
        System.out.println("----------------------");
        System.out.println("Information about departament2: " + departament2);



    }
}

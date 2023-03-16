package edu07.practical.task2;

public class task2 {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Andrii"),
                new Teacher("Mykola Ivanovych", 1500),
                new Cleaner("Fedir", 750)
        };

        for (Person person : people){
            System.out.println(person);
        }

        System.out.println("--------------------");
        for (Person person : people){
            person.print();
        }

        System.out.println("--------------------");
        for (Person person : people){
           if(person instanceof Staff){
               ((Staff) person).salary();
        }
        }


    }
}

package Homework._8;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Мені не подобалось стандартне "Я студент"
        Student s1 = new Student(new FullName("Walter", "White"), 54, 28 ){
            @Override
            public String activity(){
                return "I`m cook best meth possible. Say my name.";
            }
        };
        Student s2 = new Student(new FullName("Jassy", "Pinkman"), 30, 4 ){
            @Override
            public String activity(){
                return "I sell the product and sometime Mr. White let me cook";
            }
        };

        List<Student> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);

        list.forEach(student -> {
            System.out.println(student.info() + "\n" + student.activity() + "\n");
        });

        System.out.println("[Add another \"Student\"]========================================|\n");

        try {
            Student s3 = (Student) s1.clone();
            s3.fullName.setFirstName("Mike");
            s3.fullName.setLastName("Ehrmantraut");
            s3.setAge(60);
            s3.setCourse(35);

            //Тут не зважайте, просто вчусь використовувати анонімні класи,
            //Оскільки я присвоїв в s3 новий об'єкт,
            //То я задав в конструктор параметри об'єкту, який ми отримали шляхом клонування
            s3 = new Student(s3.fullName, s3.getAge(), s3.getCourse()){
                @Override
                public String activity(){
                    return "My job is to get rid of records and overly inquisitive people. " +
                            "\nI advise you not to be like that";
                }
            };

            //Очищаю список та заново додаю наших студентів, якщо б копіювання не працювало, то булоби видно тоді.
            //Наприклад, якщо в Person у методі clone() закоментувати стічку де ми склонуєм fullName,
            //Тоді ми змінемо ім'я Волтера Вайта також, коли задавали ім'я Майку
            list.clear();
            list.add(s1);
            list.add(s2);
            list.add(s3);

        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }

        list.forEach(student -> {
            System.out.println(student.info() + "\n" + student.activity() + "\n");
        });


    }
}

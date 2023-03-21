package com.softserve.edu10.task;
/**Створити клас Student, що містить наступні характеристики – ім’я, група, курс, оцінки по предметам.
 * Створити колекцію, що містить об'єкти класу Student.
 * Написати метод, який видаляє студентів із середнім балом <3.
 * Якщо середній бал>=3, студент переводиться на наступний курс.
 * Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів і номер курсу.
 * А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private  int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    //тут в прикладі вважається, що у вас немає одразу середньої оцінки
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void promote() {
        if (getAverageGrade() >= 3) {
             course++;
        }
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    //видалення студента з середнім балом менше 3
    public static void removeFailingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        List<Student> removedStudents = new ArrayList<>();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
                removedStudents.add(student);
            }else {
                student.promote(); // переведення на наступний курс
            }
        }
        System.out.println("Removed students:");
        for (Student student : removedStudents) {
            System.out.println(student.getName());
        }
    }

    //друк студентів із зазначенням курсу
    public static void printStudents(List<Student> students) {
        List<Integer> courses = new ArrayList<>();
        for (Student student : students) {
            if (!courses.contains(student.getCourse())) {
                courses.add(student.getCourse());
            }
        }

        for (int course : courses) {
            System.out.println("Students on course " + course + ":");
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
}
class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Додати декількох студентів
        students.add(new Student("Daria", "Group 1", 1, List.of(2, 3, 3)));
        students.add(new Student("Olena", "Group 2", 2, List.of(5, 3, 5)));
        students.add(new Student("Yuliia", "Group 1", 2, List.of(5, 5, 5)));
        students.add(new Student("Pavlo", "Group 2", 3, List.of(2, 3, 2)));
        students.add(new Student("Nikita", "Group 2", 3, List.of(2, 3, 5)));

        System.out.println("Initial list of students:");
      //  Student.printStudents(students);
        for (Student student : students) {
            System.out.println(student);
        }

        Student.removeFailingStudents(students);

        System.out.println("List of students after removing failing students:");
//        for (Student student : students) {
//            System.out.println(student);
//        }

        Student.printStudents(students);
    }
}

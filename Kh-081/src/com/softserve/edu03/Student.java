package com.softserve.edu03;

public class Student {
    private String name;
    private double rating;
    private static int count = 0;
    private static double totalSum = 0;

    //Можна було б винести каунтер з конструктора в нестатичний блок
    //таке рішення краще ніж давати його в усі конструктори
    //але і в цьому випадку можуть бути нюанси
// {
    //  count++;
    //  }


    public Student() {
        count++;
        totalSum += rating;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        count++;
        totalSum += rating;
    }

    public static double avgRating() {
        return totalSum / count;
    }

    public boolean betterStudent(Student s) {
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        totalSum -= this.rating;
        this.rating = rating;
        totalSum += rating;
    }
}

class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Olha", 90);
        Student s2 = new Student("Oleh", 60);
        Student s3 = new Student("Ivan", 70);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(Student.avgRating());
        System.out.println(s2.betterStudent(s3));
        System.out.println("Total rating is " + (s1.getRating()+s2.getRating()+s3.getRating()));

    }
}
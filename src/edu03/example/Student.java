package edu02.example;
public class Student {
    private String name;
    private float rating;

    private static int count = 0;
    private static float sumRating, avrRating;

    public Student(){
       count++;
       sumRating += rating;
    }

    public Student(String name, float rating) {
        this.name = name;
        this.rating = rating;
        count++;
        sumRating += rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public static float sumRating(){
        return sumRating;
    }

    public static float avrRating(){
        return avrRating = sumRating / count;
    }

    public boolean betterStudent(Student s){
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }


}

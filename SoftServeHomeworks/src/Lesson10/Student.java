package Lesson10;


import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public static void printStudents(List<Student> set, int course) {
        Iterator<Student> iter = set.iterator();
        while (iter.hasNext()) {
            Student st = iter.next();
            if (course == st.getCourse()) {
                System.out.println(st);
            }
        }
    }
    static class CompareStudents implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            int byName = s1.getName().compareTo(s2.getName());
        if (byName == 0) {
            return s1.getCourse() - s2.getCourse();
        }
        return byName;
        }
    }

    public static void sortStudentsByNameAndCourse(List<Student> set) {

        Collections.sort(set , new CompareStudents());
        System.out.println("list of students ordered by name and after that by course: " + set);
    }
    static class CompareStudentsByCourse implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {

                return s1.getCourse() - s2.getCourse();

        }
    }
    public static void sortStudentsByCourse(List<Student> set) {

        Collections.sort(set , new CompareStudentsByCourse());
        System.out.println("list of students ordered by corse: " + set);
    }


    @Override
    public String toString() {
        return "Student" +
                " name ='" + name + '\'' +
                ", course = " + course ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 4));
        students.add(new Student("Tod", 2));
        students.add(new Student("Alex", 3));
        students.add(new Student("Chris", 4));
        students.add(new Student("Lol", 1));
        students.add(new Student("Kante", 1));
        students.add(new Student("Simple", 1));
        students.add(new Student("Bit", 4));
        students.add(new Student("Sdy", 4));

    printStudents(students,4);
    sortStudentsByNameAndCourse(students);
    sortStudentsByCourse(students);
    }




}

package lesson9.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + course;
        return result;
    }
    public static Comparator<Student> CourseComparator = new Comparator<Student>() {
        /**
         * methods to compare students by course
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         */
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse()-o2.getCourse();
        }
    };
    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        /**
         * methods to compare students by name
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         */
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    /**
     * methods print to the console the names of the students from the list,
     * which are taught in this course (use an iterator)
     */
    public static void printStudent(List<Student> student, int course) {
        Iterator<Student> iterator = student.iterator();
        while (iterator.hasNext()) {
            Student student1 = iterator.next();
            if (student1.getCourse()==course){
                System.out.println("Name of student: " + student1.getName() + "; Course: " + student1.getCourse());
            }
        }
    }
}

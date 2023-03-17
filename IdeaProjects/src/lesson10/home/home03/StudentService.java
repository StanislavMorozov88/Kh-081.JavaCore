package lesson10.home.home03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentService {

    private StudentService() {
    }

    public static void printStudents(List<Student> studentList, int course) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getCourse() == course) {
                System.out.printf("Name: %s%n", current.getName());
            }
        }
    }

    public static NameComparator getNameComparator() {
        return new StudentService.NameComparator();
    }

    public static CourseComparator getCourseComparator() {
        return new StudentService.CourseComparator();
    }

    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getName().compareTo(o2.getName());
            return result == 0 ? Integer.compare(o2.getCourse(), o1.getCourse()) : result;
        }
    }

    public static class CourseComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int result = Integer.compare(o1.getCourse(), o2.getCourse());
            return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
        }
    }
}

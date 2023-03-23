package lesson9.hw;

import java.util.*;

/**
 * 1) Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 * realizing the operations of union and intersection of two sets.
 * Test the operation of these techniques on two pre-filled sets.
 * 2) Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen.
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.
 * 3) Write class Student that provides information about the name of the student and his course.
 * Class Student should consist of
 * properties for access to these fields
 * constructor with parameters
 * method printStudents (List students, Integer course),
 * which receives a list of students and the course number
 * and prints to the console the names of the students from the list,
 * which are taught in this course (use an iterator)
 * methods to compare students by name and by course
 * In the main() method
 * declare List students and add to the list five different students
 * display the list of students ordered by name
 * display the list of students ordered by course.
 */
public class Hw {
    public static void main(String[] args) {
        //Ex1
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        fillSet(set1);
        fillSet(set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union set: " + union(set1, set2));
        System.out.println("Intersect set: " + intersect(set1, set2));

        //Ex2
        //Create map<String, String>
        Map<String, String> personMap = new HashMap<>();
        //Add ten persons with first and last names
        personMap.put("John", "Doe");
        personMap.put("Jane", "Doe");
        personMap.put("Bob", "Smith");
        personMap.put("Alice", "Smith");
        personMap.put("Tom", "Jones");
        personMap.put("Samantha", "Jones");
        personMap.put("Frank", "Johnson");
        personMap.put("Emily", "Johnson");
        personMap.put("David", "Brown");
        personMap.put("Karen", "Brown");
        //Output the map on the screen
        System.out.println("\n      Persons:");
        printMap(personMap);
        //Remove from the map person whose firstName is ”Orest” (or other)
        System.out.println("    Persons without Emily:");
        removePersonByKey(personMap, "Emily");
        printMap(personMap);
        //There are at less two persons with the same firstName among these 10 people?
        //No, because its out key, we cant have spots with same keys.
        //If even we have, map just rewrites spot to last with same key.
        //If I must create method that checks it, idk how to do it .-.
        //im sorry :(

        //Ex3
        List<Student> students = new ArrayList<>(List.of(
                new Student("Mick", 1),
                new Student("John", 1),
                new Student("Sara", 2),
                new Student("Leo", 3),
                new Student("Nick", 2)
        ));
        System.out.println("\nPrint the names of the students, which are taught in this course: ");
        Student.printStudent(students, 1);
        students.sort(Student.NameComparator);
        System.out.println("Sort students by name: " + students);
        students.sort(Student.CourseComparator);
        System.out.println("Sort students by course: " + students);

    }

    /**
     * Fill Set with int random nums
     */
    public static void fillSet(Set<Integer> set) {
        for (int i = 0; i < 10; i++) {
            set.add((int) (Math.random() * (10 + 1) - 10));
        }
    }

    /**
     * Write parameterized methods union(Set set1, Set set2)
     */
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    /**
     * Write parameterized methods intersect(Set set1, Set set2)
     */
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    /**
     * Output the entities of the map on the screen
     */
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("FirstName: " + entry.getKey() + "; LastName: " + entry.getValue() + ".");
        }
    }

    /**
     * Remove from the map person with certain firstName
     */
    public static Map<String, String> removePersonByKey(Map<String, String> map, String value) {
        Map<String, String> temp = new HashMap<>(map);
        for (Map.Entry<String, String> entry : temp.entrySet()) {
            if (entry.getKey().equals(value)) {
                map.remove(entry.getKey());
            }
        }
        return map;
    }
}

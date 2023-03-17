package lesson10.home;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Home01 {
    public static <T> void union(Set<T> set1, Set<T> set2) {
        Set<T> union = Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toSet());
        if (union.size() == set1.size()) {
            System.out.println("No unique elements.");
        } else {
            System.out.println("The union of " + set1 + " and " + set2 + ": " + union);
        }
    }

    public static <T> void intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
        if (intersection.isEmpty()) {
            System.out.println("No intersection.");
        } else {
            System.out.println("Intersection of " + set1 + " and " + set2 + " is: " + intersection);
        }
    }

    public static void main(String[] args) {
        Set<Integer> setOfInt1 = Set.of(1, 2, 3, 4);
        Set<Integer> setOfInt2 = Set.of(1, 2, 3, 4);
        Set<String> setOfString1 = Set.of("Java", "Python", "C++");
        Set<String> setOfString2 = Set.of("Java", "Python", "C++", "PHP");


        intersection(setOfInt1, setOfInt2);
        intersection(setOfString1, setOfString2);
        union(setOfInt1, setOfInt2);
        union(setOfString1, setOfString2);
    }
}

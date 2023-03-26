package homework09;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Yellow");
        set1.add("White");
        set1.add("Purple");
        set1.add("Orange");

        System.out.println(set1);

        Set<String> set2 = new HashSet<>();

        set2.add("Banana");
        set2.add("Lime");
        set2.add("Orange");

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
        
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
}

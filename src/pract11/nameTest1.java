package pract11;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nameTest1 {
    public static void main(String[] args) {
        String pattern = "[a-zA-Z0-9_]{3,15}";

        ArrayList<String> names = new ArrayList<>();
        names.add("Alina_123");
        names.add("Jack45_56");
        names.add("1HaLLo0_wORLd");
        names.add("u5");
        names.add("hshHFF jhuif_76439ujhq");

        Pattern p = Pattern.compile(pattern);

        for (String s:names) {
            if (p.matcher(s).matches()) {
                System.out.println("m.matches() return True");
            } else {
                System.out.println("m.matches() return False");
            }
        }
    }
}

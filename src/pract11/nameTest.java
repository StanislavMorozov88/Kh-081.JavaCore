package pract11;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class nameTest {
    public static void main(String[] args) {

        String pattern = "[a-zA-Z0-9_]{3,15}";

        String name1 = "Alina_123";
        String name2 = "Jack45_56";
        String name3 = "1HaLLo0_wORLd";
        String name4 = "u5";
        String name5 = "hshHFF jhuif_76439ujhq";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name1);  //for verifying each name validation 'name1' needs to be changed to another one (e.g. 'name5')

        if (m.matches()) {
            System.out.println("m.matches() return True");
        } else {
            System.out.println("m.matches() return False");
        }
    }
}


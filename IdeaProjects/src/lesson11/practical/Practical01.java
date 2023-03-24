package lesson11.practical;

public class Practical01 {
    public static void main(String[] args) {
        String substring = "java";
        String baseString = "I love java";
        isSubstring(substring, baseString);
    }

    public static void isSubstring(String substring, String baseString) {
        if (baseString.contains(substring)){
            System.out.printf("'%s' is a substring of '%s'%n",substring,baseString);
        }else {
            System.out.printf("'" +
                    "%s' is not a substring of '%s'%n",substring,baseString);
        }
    }
}

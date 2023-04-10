package lambda13;

public class Test {
    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter =
                (s) -> String.valueOf(s.charAt(0));
        String converted = converter.convert("Java");
        System.out.println(converted); 		// "J"

        Converter<String, String> converter1 = something :: startsWith;

        String converted1 = converter1.convert("Java");
        System.out.println(converted1); 		// "J"
    }
}

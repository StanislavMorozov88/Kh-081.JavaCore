package Regex11;

public class StringTest {
    public static void main(String[] args) {

        //String from char
//        char[] chA = { 'A', 'B', 'C', 'D', 'E', 'F' };
//        System.out.println("array length = " + chA.length);
//        String str1 = new String(chA);
//        System.out.println("str1 = " + str1);
//        String str2 = new String(chA, 2,3);
//        System.out.println("str2 = " + str2);
//        System.out.println("str2 length = " + str2.length());

        //Substring
//        String str = "I study Java Kava language abc";
//
//        int a = str.indexOf("ava");
//        System.out.println("ava = " + a);
//
//        int b = str.lastIndexOf("ava");
//        System.out.println("ava = " + b);
//
//        char c = str.charAt(5);//str[5];//error
//        System.out.println("char c = " + c);
//
//        String str1 = str.substring(13);
//        System.out.println("str1 = " + str1);
//
//        str1 = str1.toLowerCase();
//        System.out.println("new str1 = " + str1);
//
//        String str2 = str.substring(3,10);
//        System.out.println("str2 = " + str2);
//
//        Boolean result = str.startsWith("I study");
//        System.out.println("startsWith = " + result);
//
//        result = str.endsWith("abc");
//        System.out.println("endsWith = " + result);
//
//        result = str.startsWith("Java", 8);
//        System.out.println("startsWith 8 index= " + result);

        //Trim method
//        String str3 = "\t\t    Tabulated String   \t\n\r\n";
//        System.out.println(str3);
//        str3 = str3.trim();
//        System.out.println(str3);

//        String str4 = "abracadabra abcdea";
//        System.out.println(str4);
//
//        System.out.println(str4.replace("a", "*"));
//        System.out.println(str4.replaceAll("\\ba|a\\b","**")); // \b mean word boundary
//        System.out.println(str4.replaceAll("\\Ba\\B", "-")); // 	\B A non-word boundary
//        System.out.println(str4.replaceFirst("a", "--"));
//        System.out.println(str4.replaceFirst("b", "-*"));
//        str4 = "gbkboknbgko";
//        System.out.println(str4.isEmpty());
//
//        String a = "a";
//        String A = "A";
//        String b = "a";
//
//        System.out.println(a.equals(A));
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(A));
//        System.out.println(a.compareTo(A));
//        System.out.println(a.compareToIgnoreCase(A));
//        String a = "Java";
//        String b = "Java";
//        String c = new String("Java");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//
//        System.out.println(a.compareTo(b));
//        System.out.println(a.compareTo(c));
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());

        //

        String s1 = new String("Hello ");
        String s2 = "And Goodbye!";

        String s3 = s1 + s2;//
        String s4 = s1.concat(s2);
        System.out.println(s4);

        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abcderrrrr");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        //System.out.println(sb.reverse());
        System.out.println(sb.insert(5," not "));

    }
}

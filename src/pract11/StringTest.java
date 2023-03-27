package pract11;

public class StringTest {
    public static void main(String[] args) {

        String str1 = "IT";
        String str2 = "IT Academy";

        boolean isFound  = str2.contains(str1);
        System.out.println(isFound);

        String surname = "Popko";
        String name = "Oleh";
        String patronymic = "Volodymyrovych";

        String name1 = name.substring(0, 1);
        String patronymic1 = patronymic.substring(0, 1);
        System.out.println(surname + " " + name1 + "." + patronymic1+ ".");
        System.out.println(name);
        System.out.println(name + " " + patronymic + " " + surname);
    }
}

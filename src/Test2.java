public class Test2 {
    public static void main(String[] args) {
        Integer n1 = 0;
        Integer n2 = null;
        if (n1 == null | n1 == 0 && n2 == 0)
            System.out.println("1");
        if (n2 == null)
            System.out.println("2");
        else
            System.out.println("3");
    }
}

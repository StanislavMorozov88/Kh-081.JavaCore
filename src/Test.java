public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Student s1 = new Student("Den", 96.2F);
        Student s2 = new Student("Mari", 96.8F);
        Student s3 = new Student();

        s3.setName("Vira");
        s3.setRating(66.5F);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(Student.avgRating());

        System.out.println(s2.betterStudent(s1));
    }
}

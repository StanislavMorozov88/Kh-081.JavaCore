public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 97.2f);
        Student s2 = new Student("Vera", 34.5f);
        //Student s3 = new Student("Ira", 98.0f);
        Student s3 = new Student();
        s3.setName("Ira");
        s3.setRating(98.0f);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(Student.avrRating());


        System.out.println(s2.betterStudent(s1));
    }

}

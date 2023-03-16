package homework07;

public class MainStudent {
    public static void main(String[] args) throws CloneNotSupportedException {


        Student student1 = new Student("Nick", "Jackson", 23, "Nick Jackson", 1);
        Student student2 = new Student("Eliza", "Johnson", 25, "Eliza Johnson", 3);

        System.out.println(student1.info());
        System.out.println(student1.activity() + "in Colorado, " + student1.getCourseNumber() + " course");

        System.out.println("**************************************************");

        System.out.println(student2.info());
        System.out.println(student2.activity() + "in Chicago, " + student2.getCourseNumber() + " course");

        Student copyOfStudent1 = (Student) student1.clone();
        copyOfStudent1.setCourseNumber(4);

        System.out.println("**************************************************");

        System.out.println(copyOfStudent1.info());
        System.out.println(copyOfStudent1.activity() + "in Colorado, " + copyOfStudent1.getCourseNumber() + " course");
    }
}

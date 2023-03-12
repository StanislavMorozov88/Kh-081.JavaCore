package lesson7.hw;

//  In the main(...) method, create two instances of the Student class
//      and output information about them by calling the appropriate methods` info() and activity()
//  Create one more instance of Student class by cloning the first student,
//      change a course for this object and output full information about all of created students

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //create two instances of the Student class
        Student student = new Student(new FullName("Mick", "Taylor"), 22, 123);
        Student student1 = new Student(new FullName("John", "Smith"), 25, 122);

        //output information about them by calling the appropriate methods` info() and activity()
        System.out.println(student.info() + "\n" + student.activity());
        System.out.println(student1.info() + "\n" + student1.activity());

        //Create one more instance of Student class by cloning the first student
        Student copyOfStudent = (Student) student.clone();
        copyOfStudent.setCourse(121);
        Student copyOfStudent1 = (Student) student.clone();
        copyOfStudent1.setCourse(124);

        //output full information about all of created students
        System.out.println(" ");
        System.out.println(student.info() + "\n" + student.activity());
        System.out.println(student1.info() + "\n" + student1.activity());
        System.out.println(copyOfStudent.info() + "\n" + copyOfStudent.activity());
        System.out.println(copyOfStudent1.info() + "\n" + copyOfStudent1.activity());


    }
}

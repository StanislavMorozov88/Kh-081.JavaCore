package lesson08.hometask.with_copy_constructor;

public class PersonMain {
    public static void main(String[] args) {
        Person student1 = new Student(new Person.FullName("Oleksandr", "Ivanov"), 50, 8);
        Student student2 = new Student(new Person.FullName("Olena", "Kiselyova"), 40, 3);
        Student copyOfStudent1 = new Student((Student) student1); //cloning the student1
        Student copyOfStudent2 = new Student(student2); // cloning student2
        copyOfStudent1.setCourse(2);//course change for a cloned student
        copyOfStudent2.setCourse(5);

        Person[] students = {student1, student2, copyOfStudent1, copyOfStudent2};
        //output info about all students
        for (Person student : students) {
            student.info();
        }
    }
}

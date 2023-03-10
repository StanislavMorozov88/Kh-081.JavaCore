package lesson08.hometask.with_clone;

public class PersonMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person student1 = new Student(new Person.FullName("Oleksandr", "Ivanov"), 40, 8);
        Student student2 = new Student(new Person.FullName("Olena", "Kiselyova"), 40, 3);
        Student copyOfStudent1 = (Student) student1.clone(); //cloning the student1
        copyOfStudent1.setCourse(2);//course change for a cloned student

        Person[] students = {student1, student2, copyOfStudent1};
        //output info about all students
        for (Person student : students) {
            student.info();
        }
    }
}

package lesson08.hometask.with_copy_constructor;

public class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student(Student another) {
        super(another);
        this.course = another.course;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf(", Course: %d%n", course);
        System.out.println(activity() + "\n");
    }

    @Override
    public String activity() {
        switch (course) {
            case 1:
                return String.format("I am a %dst year university student.%n", course);
            case 2:
                return String.format("I am a %dnd year university student.%n", course);
            case 3:
                return String.format("I am a %dd year university student.%n", course);
            case 4:
            case 5:
            case 6:
                return String.format("I am a %dth year university student.%n", course);
            default:
                return "Seems the course data is outdated";
        }
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

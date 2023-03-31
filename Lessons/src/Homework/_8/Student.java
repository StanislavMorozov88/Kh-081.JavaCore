package Homework._8;

public class Student extends Person implements Cloneable{

    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }



    @Override
    public String info(){
        return super.info() +", Course: \033[0;36m" + course + "\033[0m";
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        return copyOfStudent;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

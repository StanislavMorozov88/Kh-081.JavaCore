package lesson7.hw;

//  Develop a Student class with an int field that matches the course the student is taking.
//        In the Student class, create a constructor with parameters to initialize all fields in the class,
//        and override the info() method (which would also add course information to the previous line),
//        and the activity() method from the Person class.
//   The activity() method should return a string value
//     that is the type of activity for the corresponding Person subtype,
//     for example for a student - this could be the value "I study at university".


public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // override the info() method (which would also add course information to the previous line)
    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    //activity() method from the Person class
    @Override
    public String activity() {
        return "I study at university";
    }
}

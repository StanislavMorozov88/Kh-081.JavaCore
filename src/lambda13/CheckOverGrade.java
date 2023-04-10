package lambda13;

public class CheckOverGrade implements StudentsCheck {

    @Override
    public boolean check(Student s) {
        return s.averageGrade>80;
    }
}

package streams14;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List<Student> studentOnDepartment;

    public Department(String name) {
        this.name = name;
        studentOnDepartment = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentOnDepartment() {
        return studentOnDepartment;
    }
    public void addStudentToDepartment(Student st) {studentOnDepartment.add(st);}
}

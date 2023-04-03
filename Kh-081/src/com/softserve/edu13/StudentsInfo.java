package com.softserve.edu13;

import com.softserve.edu13.lambda.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentsInfo {
    void testStudents(ArrayList<Student> all, Predicate<Student> st) {
        for (Student s : all) {
            if (st.test(s)) {
                System.out.println(s);
            }
        }
    }
}

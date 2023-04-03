package com.softserve.edu13.lambda;

public class CheckOverGrade implements StudentsCheck{
    @Override
    public boolean check(Student s) {
        return s.averageGrade>80;
    }
}

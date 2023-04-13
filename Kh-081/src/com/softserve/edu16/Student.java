package com.softserve.edu16;

import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    protected static String bachelor;
   // private int id;
    private String name;
    private transient String password;

    public Student(String bachelor, String name, String password) {
        Student.bachelor = bachelor;
      // this.id = id;
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return "Fac: " + bachelor + ", name: " + name + ", pas: " + password;
    }
}

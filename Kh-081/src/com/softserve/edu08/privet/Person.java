package com.softserve.edu08.privet;

public class Person {
    private FullName fullName = new FullName();
    private int age;

    public Person(String firsName, String lastName, int age) {
        fullName.firstName = firsName;
        fullName.lastName = lastName;
        this.age = age;
    }

    private class FullName {
        private String firstName;
        private String lastName;

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

         }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

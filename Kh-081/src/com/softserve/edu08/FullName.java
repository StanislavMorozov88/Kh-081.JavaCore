package com.softserve.edu08;

class FullName implements Cloneable {
    private String firstName;
    private String lastName;

    public FullName() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
package edu.isu.cs.student.project;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected String firstName;
    protected String lastName;
    protected List<Course> coursesList;

    public Student() {
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

    public List<Course> getCoursesList() {
        return coursesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    public static void main(String[] args) {


    }
}

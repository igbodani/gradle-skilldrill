package edu.isu.cs.student.project;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected String firstName;
    protected String lastName;
    protected List<Course> coursesList;

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
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int [][] fam = {{1,2,3}, {4,5,6},{7,8,9}};
        for(int i = 0; i < fam.length; i++){
            for (int j = 0; j < fam[i].length;j++){
                System.out.print(fam[i][j]);
            }
            System.out.println();
        }
     //   System.out.println(data.length);
    }



}

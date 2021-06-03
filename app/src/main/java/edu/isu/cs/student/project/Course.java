package edu.isu.cs.student.project;

public class Course {
    private String title;
    private int number;
    private String subject;

    public Course() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", number=" + number +
                ", subject='" + subject + '\'' +
                '}';
    }
}

package ua.opnu;

import java.util.ArrayList;

public class Student {

    private String name;
    private int year;
    private ArrayList<String> courses;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        courses.add(courseName);
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        return year * 20000;
    }

    public int getYear() {
        return year;
    }
}

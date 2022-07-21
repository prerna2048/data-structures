package com.practice;

public class Student {
    private String name;
    private String id;
    private String school;

    public Student(String name, String id, String school) {
        this.name = name;
        this.id = id;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }
}

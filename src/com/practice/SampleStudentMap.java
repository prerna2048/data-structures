package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SampleStudentMap {

    List<List<Student>> multiList = new ArrayList<>(1000);

    Student getStudent(String name) {
        int hashCode = getStudentMapHashCode(name);
        List<Student> studentList = getStudentList(hashCode);

        for (Student student : studentList) {
            if (name.equals(student.getName()))
                return student;
        }
        return null;
    }

    private List<Student> getStudentList(int hashCode) {
        if (multiList.get(hashCode) == null) {
            return new ArrayList<>();
        }
        return multiList.get(hashCode);
    }

    private int getStudentMapHashCode(String name) {
        return getAsciForInitals(name);
    }

    private int getAsciForInitals(String name) {
        return name.toUpperCase().charAt(0) - 65;
    }

    void putStudent(String name, Student student) {
        int hashCode = getStudentMapHashCode(name);
        List<Student> studentList = getStudentList(hashCode);
        boolean keyAlreadyPresent = studentList.stream().map(student1 -> student1.getName().equals(name)).findAny().isPresent();
        if (!keyAlreadyPresent) {
            studentList.add(student);
        }//else : log error message that student cannot be adddec to map cause the key is not unique
    }


    public static void main(String[] args) {

        SampleStudentMap studentMap = new SampleStudentMap();
        studentMap.putStudent("Abhi", new Student("Abhi", "1234", "ABC School"));
    }


    //Akki was saying how can you actually keep the key and value related. For that he created a seperate class called node.
    //HERE we need not  provide a new class cause we have kept name in student.
}

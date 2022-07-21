package com.practice.FI.personExample.oldSchool;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public Person(String name, int age, Sex gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public boolean isOlderThanAge(int biggerAge) {
        return age > biggerAge;
    }

    public boolean isBetweenAge(int lowerAge,int biggerAge) {
        return age> lowerAge && age < biggerAge;
    }

    public boolean isMale() {
        return gender.name().equals(Sex.MALE.name());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

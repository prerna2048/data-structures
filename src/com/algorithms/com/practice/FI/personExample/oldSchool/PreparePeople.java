package com.algorithms.com.practice.FI.personExample.oldSchool;

import java.util.List;

import static java.util.Arrays.asList;

public class PreparePeople {

    public static List<com.algorithms.com.practice.FI.personExample.oldSchool.Person> create() {
        return asList(new Person("Ravi", 20, Person.Sex.MALE, "abc@abc.com"),
                new Person("Ravi2", 30, Person.Sex.MALE, "abc@abc.com"),
                new Person("Ravi3", 40, Person.Sex.MALE, "abc@abc.com"),
                new Person("Ravi4", 50, Person.Sex.MALE, "abc@abc.com"),
                new Person("Ravi5", 60, Person.Sex.MALE, "abc@abc.com"));
    }
}

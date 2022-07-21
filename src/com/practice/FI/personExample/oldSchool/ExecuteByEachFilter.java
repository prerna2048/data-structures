package com.practice.FI.personExample.oldSchool;


import java.util.List;

public class ExecuteByEachFilter {

    static void getPeopleByAgeFilter(List<Person> people){
        people.stream().forEach(person -> {
            if(person.isBetweenAge(10,20)){
                System.out.println(person.toString());
            }
        });
    }

    static void getPeopleByMaleFilter(List<Person> people){
        people.stream().forEach(person -> {
            if(person.isMale()){
                System.out.println(person.toString());
            }
        });
    }

    public static void main(String[] args) {
        List<Person> people = PreparePeople.create();
        getPeopleByAgeFilter(people);
        getPeopleByMaleFilter(people);
    }
}

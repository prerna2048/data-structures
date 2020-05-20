package com.algorithms.com.practice.FI.personExample.Lambda;

import com.algorithms.com.practice.FI.personExample.Person;
import com.algorithms.com.practice.FI.personExample.PreparePeople;

import java.util.List;

public class ExecuteByLambda {

    private static void filterEachPerson(List<Person> personList, PersonFilter personFilter){
         personList.stream().forEach(person -> {
            if(personFilter.filter(person)){
                System.out.println(person);
            }
        });
    }

    public static void main(String[] args) {
        List<Person> people = PreparePeople.create();
        filterEachPerson(people, person ->  person.age> 10 && person.age < 20);
        filterEachPerson(people, person -> person.gender.name().equals(Person.Sex.MALE.name()));

    }
}

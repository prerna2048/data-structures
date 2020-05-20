package com.algorithms.com.practice.FI.personExample.anonymousClass;

import com.algorithms.com.practice.FI.personExample.Person;
import com.algorithms.com.practice.FI.personExample.PreparePeople;

import java.util.List;

public class ExecuteByAnonymousClassFilter {

    private static void filterEachPerson(List<Person> personList, PersonFilter personFilter){
         personList.stream().forEach(person -> {
            if(personFilter.filter(person)){
                System.out.println(person);
            }
        });
    }

    public static void main(String[] args) {
        List<Person> people = PreparePeople.create();
        filterEachPerson(people, new PersonFilter() {
            @Override
            public boolean filter(Person person) {
                return person.age> 10 && person.age < 20;
            }
        });
        filterEachPerson(people, new PersonFilter() {
            @Override
            public boolean filter(Person person) {
                return person.gender.name().equals(Person.Sex.MALE.name());
            }
        });

    }
}

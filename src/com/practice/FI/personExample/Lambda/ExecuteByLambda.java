package com.practice.FI.personExample.Lambda;

import com.practice.FI.personExample.Person;
import com.practice.FI.personExample.PreparePeople;

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
//        List<Person> people = PreparePeople.create();
//        filterEachPerson(people, person ->  person.age> 10 && person.age < 20);
//        filterEachPerson(people, person -> person.gender.name().equals(Person.Sex.MALE.name()));
//
//        people.sort((Person p1, Person p2) ->p1.name.compareTo(p2.name));
//       // no need to add the data types to the obkject in the parameter.
//        //(single Arg) -> lambda no need of brackets if single arg being passed
//        // avoid braces in lambda , instead use expression lambda.
//        // So even if we feel the need to write braces lambda, we can extract it over method so that we still write expression lambda
//        System.out.println(people.toString());
        double d1 = 1000.0;
        double d2 = 0.001;
        double d3 = d1+ d2;
        System.out.println("double d3" + d3);
    }
}

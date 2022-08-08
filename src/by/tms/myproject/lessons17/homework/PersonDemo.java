package by.tms.myproject.lessons17.homework;


import by.tms.myproject.lessons16.Actor;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Иванов", 101);
        Person person2 = new Person("Василий", "Петров", 30);
        Person person3 = new Person("Ли", "Бей", 100);
        Person person4 = new Person("Анжелика", "Куприяновна", 25);


        Optional<String> persons = Stream.of(person1, person2, person3, person4)
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .filter(nameAll -> nameAll.length() < 15)
                .reduce((firstName, lastName) -> firstName + ", " + lastName);

        //  .max(Comparator.comparingInt(Person::getAge));
        if (persons.isPresent()) {
            String names = persons.get();
            System.out.println(names);


            OptionalInt personAge = Stream.of(person1, person2, person3, person4)
                    .map(per -> per.getAge())
                    .mapToInt(num -> num)
                    .max();
            if (persons.isPresent()) {
                Integer age = personAge.getAsInt();
                System.out.println(age);

            }
        }
    }
}
package com.company.abstractClasses;

public class PersonTest {

    public static void main(String[] args) {


        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person person: people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }

        Employee e = new Employee("Dima Krylov", 30000, 2017, 5, 20);
        System.out.println(e);
    }
}

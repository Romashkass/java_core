package org.example.module11;

import java.util.Arrays;
import java.util.Comparator;

public class Module11_1 {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("b", 22),
                new Person("a", 11),
                new Person("a", 1),
                new Person("b", 2),
                new Person("c", 3),
                new Person("d", 4)
        };

        for (Person person: people) {
            System.out.println(person);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("sorted");
        for (Person person: people) {
            System.out.println(person);
        }
    }
}

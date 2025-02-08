package org.example.module15._2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Module15_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        System.out.println("1: " + list.stream().filter("a1"::equals).count());
        System.out.println("2: " + list.stream().findFirst().orElse("0"));
        System.out.println("3: " + list.stream().skip(2).findFirst().orElse("0"));
        System.out.println("4: " + list.stream().skip(1).limit(2).collect(Collectors.toList()));
        System.out.println("5: " + list.stream().filter("a1"::equals).collect(Collectors.toList()));
        System.out.println("6: " + list.stream().anyMatch("a1"::equals));
        System.out.println("7: " + list.stream().anyMatch(item -> !"a7".equals(item)));
        System.out.println("8: " + Arrays.toString(list.stream().mapToInt(item -> Integer.parseInt(item.substring(1))).toArray()));
        System.out.println("9: " + list.stream().collect(Collectors.joining()));
        System.out.println("10: " + list.stream().sorted().collect(Collectors.toList()));

        List<People> people = Arrays.asList(
                new People("Basil", 16, Sex.MAN),
                new People("Peter", 23, Sex.MAN),
                new People("Helen", 42, Sex.WOMAN),
                new People("Ivan", 69, Sex.MAN)
        );
        System.out.println("1: " + people.stream().filter(item -> item.getAge() >= 18 && item.getAge() < 27).collect(Collectors.toList()));
        System.out.println("2: " + people.stream().filter(item -> item.getSex() == Sex.MAN).mapToInt(People::getAge).average().orElse(-1));
        System.out.println("3: " + people.stream().filter(item -> {
            if (item.getAge() < 18) return false;
            if (item.getSex() == Sex.MAN) return item.getAge() < 60;
            return item.getAge() < 55;
        }).count());
        System.out.println("4: " + people.stream().min(Comparator.comparingInt(People::getAge)).orElse(null));
        System.out.println("5: " + people.stream().sorted(Comparator.comparing(People::getSex).thenComparingInt(People::getAge)).map(People::getName).collect(Collectors.toList()));
    }
}

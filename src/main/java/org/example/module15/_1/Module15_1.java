package org.example.module15._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Module15_1<T> {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "", "1", "22", "333", "4444", "55555", "666666", "7777777", "88888888", "999999999"
        };
        new Module15_1<String>().filter(arr, (o) -> o.length() > 5);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = new Integer[100];
        new Module15_1<Integer>().fill(arr2, integer -> integer * integer);
        System.out.println(Arrays.toString(arr2));

        Dog dog = new Dog("name1", 1, 1.2);
        Converter<Dog, Cat> converter = x -> new Cat(x.getName(), x.getAge(), x.getWeight());
        Cat cat = converter.convert(dog);
        System.out.println(cat);

        Predicate<Integer> predicate = integer -> integer%2 == 0;
        System.out.println(predicate.test(13));
        System.out.println(predicate.test(12));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Text");

        List<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");
        Supplier<String> supplier = () -> nameList.get(new Random().nextInt(nameList.size()));
        for (int i = 0; i < 10; i++) {
            System.out.print(supplier.get() + ", ");
        }
        System.out.println();

        Function<String, Integer> function = Integer::parseInt;
        System.out.println(function.apply("1234"));

        UnaryOperator<Integer> operator = number -> number * number;
        System.out.println(operator.apply(12));
    }

    private T[] filter(T[] arr, Filter<T> filter) {
        for (int i = 0; i < arr.length; i++) {
            if (!filter.apply(arr[i])) {
                arr[i] = null;
            }
        }
        return arr;
    }

    private Integer[] fill(Integer[] arr, Function<Integer, Integer> function) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = function.apply(i);
        }
        return arr;
    }


}

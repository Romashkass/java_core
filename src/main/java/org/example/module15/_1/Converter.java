package org.example.module15._1;

public interface Converter<T, N> {
    N convert (T t);
    static <T> boolean IsNotNull(T t) {
        return t != null;
    }
    default void writeToConsole (T t) {
        System.out.println(t);
    }
}

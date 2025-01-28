package org.example.module6;

import java.util.ArrayList;
import java.util.List;

public class Module6_1 {
    public static void main(String[] args) {
//        stackOverflowError();
//        outOfMemoryError();
        outOfMemoryError2();
    }

    private static void stackOverflowError() {
        stackOverflowError();
    }

    private static void outOfMemoryError() {
        long[] arr = new long[Integer.MAX_VALUE - 1];
    }

    private static void outOfMemoryError2() {
        List<Integer> list = new ArrayList<>();
        while (true) {
            list.add(1);
        }
    }
}

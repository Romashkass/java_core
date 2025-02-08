package org.example.module13;

import java.util.ArrayList;
import java.util.List;

public class Module13_1 {
    public static void main(String[] args) {
        System.out.println(joseph(10, 2) + " : " + 5);
        System.out.println(joseph(41, 2) + " : " + 19);
        System.out.println(joseph(100, 2) + " : " + 73);
        System.out.println(joseph(41, 3) + " : " + 31);

        System.out.println(joseph(5, 2) + " : " + 3);
        System.out.println(joseph(7, 3) + " : " + 4);
        System.out.println(joseph(1, 1) + " : " + 1);
        System.out.println(joseph(10, 4) + " : " + 5);
        System.out.println(joseph(6, 5) + " : " + 1);
        System.out.println(joseph(14, 2) + " : " + 13);
        System.out.println(joseph(3, 3) + " : " + 2);
        System.out.println(joseph(8, 7) + " : " + 4);
        System.out.println(joseph(9, 1) + " : " + 9);
        System.out.println(joseph(15, 6) + " : " + 7);
    }

    private static int joseph(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int  pointer = 0;
        for (int i = 0; i < n - 1; i++) {
            pointer += m - 1;
            if (pointer >= list.size()) {
                pointer %= list.size();
            }
            list.remove(pointer);
        }
        return list.get(0);
    }
}

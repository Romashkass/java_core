package org.example.module14;

import java.util.*;

public class Module14_1 {
    public static void main(String[] args) {
        String[] names = {"Milk", "Bread", "Salad", "Broccoli", "Pears", "Pineapples", "Butter"};
        Map<String, Integer> map = new HashMap<>();
        for (String s: names) {
            map.put(s, new Random().nextInt(40) + 30);
        }
        System.out.println(map);
        int max = 0;
        String maxName = "";
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                maxName = entry.getKey();
            }
        }
        System.out.println(maxName);
        Set<String> set = new HashSet<>(map.keySet());
        String[] newNames = {"Sweets", "Chocolate", "Cookies", "Marmalade"};
        set.addAll(Arrays.asList(newNames));
        System.out.println(set);
    }
}

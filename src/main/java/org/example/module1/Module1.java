package org.example.module1;

public class Module1 {
    public static void main(String[] args) {
        Module1 module1 = new Module1();
        System.out.println(module1.getClass().getClassLoader());
        System.out.println(module1.getClass().getClassLoader().getParent());
        System.out.println(module1.getClass().getClassLoader().getParent().getParent());
        System.out.println("==");
        Integer i = 5;
        System.out.println(i.getClass().getClassLoader());
        System.out.println("==");
        Example example = new Example();
        System.out.println(example.getClass().getClassLoader());
        System.out.println(example.getClass().getClassLoader().getParent());
        System.out.println(example.getClass().getClassLoader().getParent().getParent());
    }
}

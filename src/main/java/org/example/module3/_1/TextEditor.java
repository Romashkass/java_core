package org.example.module3._1;

import java.util.Scanner;

public class TextEditor {
    public String concat(String first, String second) {
        return first + second;
    }

    public String insert(String base, String insert, int position) {
        return base.substring(0, position) + insert + base.substring(position);
    }

    public String remove(String base, Character character) {
        return base.replaceAll("[" + character + "]", "");
    }

    public String replace(String base, String what, String to) {
        return base.replace(what, to);
    }

    public String readFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String reverse(String base) {
        StringBuilder result = new StringBuilder();
        for (int i = base.length() - 1; i >= 0; i--) {
            result.append(base.charAt(i));
        }
        return result.toString();
    }

    public String deleteSpaces(String base) {
        StringBuilder result = new StringBuilder(base);
        for (int i = base.length() - 1; i >= 0; i--) {
            if (base.charAt(i) == ' ') {
                result.deleteCharAt(i);
            }
        }
        return result.toString();
    }

    public String upperLetters(String base) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < base.length(); i++) {
            char ch = base.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String evenLetters(String base) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < base.length(); i += 2) {
            result.append((char) (base.charAt(i) - 32));
        }
        return result.toString();
    }

    public String[] readArrayFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextLine();
//            arr[i] = "".equals(arr[i]) ? null : arr[i];
        }
        return arr;
    }

    public String[] arrayFiller(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null == arr[i] || "".equals(arr[i]) ? "String is empty" : arr[i];
        }
        return arr;
    }

    public void what() {
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";

        System.out.println("1:");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str4));
        System.out.println("2:");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str4);
        System.out.println("3:");
        str1 = "JavaJava";
        System.out.println(str1.substring(4) == str4);
        System.out.println("4:");
        System.out.println(str1 == null);
        System.out.println("5:");
        str1 = null;
        System.out.println(str1 == null);
    }
}

package org.example.module5;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Module5_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Objects.requireNonNull(Module5_1.class.getClassLoader().getResourceAsStream("input_5_1.txt")));

        int studentCount = scanner.nextInt();
        Student[] students = new Student[studentCount];
        double avg = 0;
        for (int i = 0; i < studentCount; i++) {
            scanner.nextLine();
            String lastName = scanner.nextLine();
            String firstName = scanner.nextLine();
            double gpa = scanner.nextDouble();
            avg += gpa;
            students[i] = new Student(firstName, lastName, gpa);
        }
        avg /= studentCount;
        System.out.printf("%.2f\n", avg);

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGpa() < avg) {
                System.out.println(students[i]);
            }
        }
    }
}

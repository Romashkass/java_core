package org.example.module5;

public class Student {
    private static int studentCount;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        studentCount++;
        showStudentCount();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void showStudentCount() {
        System.out.println("Current student count: " + studentCount);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + gpa;
    }
}

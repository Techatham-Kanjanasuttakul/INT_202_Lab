package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1001, "somchai", 4.5);
        System.out.println(student.getName());
        System.out.println(student);
        String[] s = {"Somchai", "Somsri"};
        for (String x : s) {
            System.out.println(x);
        }
    }
}
package com.mycompany.report;

import java.util.Scanner;
public class Report {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        String[] subjects = {"English", "Mathematics", "Life Orientation", "Physical Sciences", "CAT"};
        int[] marks = new int[subjects.length];
        double total = 0;

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter mark for " + subjects[i] + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }

        double average = total / subjects.length;

        // Output using simple Println (No format specifiers)
        System.out.println("\n--- OFFICIAL REPORT ---");
        System.out.println("Student: " + name);
        System.out.println("-----------------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i] + "%");
        }

        System.out.println("-----------------------");
        System.out.println("Average: " + average + "%");
        System.out.println("Status: " + (average >= 50 ? "PASS" : "FAIL"));
        
        input.close();
    }
}
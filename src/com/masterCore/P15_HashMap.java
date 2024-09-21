package com.masterCore;

import java.util.HashMap;
import java.util.Scanner;

public class P15_HashMap {
    private static HashMap<String, Integer> student = new HashMap<String, Integer>();

    protected static void addStudent(Scanner scan) {  // Accept scanner as a parameter
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Marks: ");
        Integer marks = scan.nextInt();
        scan.nextLine(); // Consume the newline left by nextInt()
        System.out.println(name + "'s marks are " + marks);
        student.put(name, marks);
        System.err.println("Added Successfully..");
    }

    public static void getStudentMarksByName(String name) {
        if (student.containsKey(name)) {
            System.err.println("Marks of " + name + " are " + student.get(name));
        } else {
            System.err.println("Student not found.");
        }
    }

    public static void getAllStudents() {
        System.err.println("List of All Students with Marks");
        student.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {
                System.err.println(" 0 for Exit.\n 1 for Add Student.\n 2 for Get Student by Name.\n 3 for Get all Students with Marks.");
                int opt = scan.nextInt();
                scan.nextLine(); // To consume the newline left by nextInt()
                if (opt == 0)
                    break;
                if (opt == 1)
                    addStudent(scan);  // Pass the scanner to the method
                if (opt == 2) {
                    System.out.print("Enter Student Name: ");
                    String name = scan.nextLine();
                    getStudentMarksByName(name);
                }
                if (opt == 3)
                    getAllStudents();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        scan.close();  // Close the scanner here at the end
    }
}

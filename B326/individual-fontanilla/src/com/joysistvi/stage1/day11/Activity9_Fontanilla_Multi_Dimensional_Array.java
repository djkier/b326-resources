package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Fontanilla_Multi_Dimensional_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] studentNames;
        String[] subjectNames;
        int[][] grades;

        //Welcome prompt
        System.out.println("*********************");
        System.out.println("Average Calculator");
        System.out.println("*********************");
        System.out.print("Enter number of students: ");
        int studentCount = input.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjectCount = input.nextInt();
        input.nextLine();
        System.out.println();

        studentNames = new String[studentCount];
        subjectNames = new String[subjectCount];
        grades = new int[studentCount][subjectCount];

        //Ask for subject name
        System.out.println("Enter subject names: ");
        for (int i = 0; i < subjectNames.length; i++) {
            int count = i + 1;
            System.out.print("Subject " + count + ": ");
            subjectNames[i] = input.nextLine();
        }
        System.out.println();

        //Ask for student name and there grade
        for (int j = 0; j < studentNames.length; j++) {
            int count = j + 1;
            System.out.print("Name of Student " + count + ":");
            studentNames[j] = input.nextLine();

            System.out.println("Enter grades for each subject:");
            for (int k = 0; k < subjectNames.length; k++) {
                System.out.print(subjectNames[k] + ": ");
                int grade = input.nextInt();
                grades[j][k] = grade;
            }
            input.nextLine();
            System.out.println();
        }

        //report
        System.out.println("===============================");
        System.out.println("Grade Report");
        System.out.println("===============================");

        //UI for column head
        System.out.printf("%s-20", "Student");
        for (String subjectName : subjectNames) {
            System.out.printf("%-12s", subjectName);
        }
        System.out.printf("%-12s%n", "Average");
        System.out.println("----------------------------------------------------------------------------------");

        for (int l = 0; l < grades.length; l++) {
            int sum = 0;

            System.out.printf("%-20s", studentNames[l]);

            for (int m = 0; m < grades[l].length; m++) {
                System.out.printf("%-12d", grades[l][m]);
                sum += grades[l][m];
            }

            double average = (double) sum / grades[l].length;

            System.out.printf("%-12.2f%n", average);
        }

    }
}

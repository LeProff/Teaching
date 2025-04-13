package tech.lpdev.textbook.ch4.review;

import java.util.Scanner;

public class GradeAvg1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first grade: ");
        int first = input.nextInt();
        System.out.print("Enter second grade: ");
        int second = input.nextInt();
        System.out.print("Enter third grade: ");
        int third = input.nextInt();
        System.out.print("Enter fourth grade: ");
        int fourth = input.nextInt();
        System.out.print("Enter fifth grade: ");
        int fifth = input.nextInt();
        double average = (double)(first + second + third + fourth + fifth) / 5.0;
        System.out.printf("The average grade is %.1f%%", average);
    }
}

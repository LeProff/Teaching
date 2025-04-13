package tech.lpdev.textbook.ch4.review;

import java.util.Scanner;

public class GradeAvg2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avg = 0;
        System.out.print("Enter first grade: ");
        avg += input.nextInt();
        System.out.print("Enter second grade: ");
        avg += input.nextInt();
        System.out.print("Enter third grade: ");
        avg += input.nextInt();
        System.out.print("Enter fourth grade: ");
        avg += input.nextInt();
        System.out.print("Enter fifth grade: ");
        avg += input.nextInt();
        System.out.printf("The average grade is %.1f", (avg / 5.0));
    }
}

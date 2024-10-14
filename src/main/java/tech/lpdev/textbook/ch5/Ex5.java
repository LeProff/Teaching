package tech.lpdev.textbook.ch5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        int per = input.nextInt();

        if (per >= 90) {
            System.out.println("The corresponding letter grade is: A");
            return;
        } if (per >= 80) {
            System.out.println("The corresponding letter grade is: B");
            return;
        } if (per >= 70) {
            System.out.println("The corresponding letter grade is: C");
            return;
        } if (per >= 60) {
            System.out.println("The corresponding letter grade is: D");
            return;
        }
        System.out.println("The corresponding letter grade is : F");
    }
}

package ca.leproff.teaching.solutions.ch7.review;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int base = input.nextInt();
        System.out.print("Enter another number: ");
        int exponent = input.nextInt();

        System.out.printf("%d^%d = %d", base, exponent, powerOf(base, exponent));
        System.out.println(base + "^" + exponent + " = " + Math.round(powerOf(base, exponent)));
    }

    public static int powerOf(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}

package tech.lpdev.textbook.ch7.review;

import math.MathUtil;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int base = input.nextInt();
        System.out.print("Enter another number: ");
        int exponent = input.nextInt();

        System.out.printf("%d^%d = %d", base, exponent, powerOf(base, exponent));
        System.out.println(base + "^" + exponent + " = " + MathUtil.round(powerOf(base, exponent), 2));
    }

    public static int powerOf(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}

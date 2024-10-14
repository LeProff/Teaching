package tech.lpdev.textbook.ch7.review;

import math.MathUtil;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double base = input.nextDouble();
        System.out.print("Enter another number: ");
        double exponent = input.nextDouble();

        System.out.println(base + "^" + exponent + " = " + MathUtil.round(powerOf(base, exponent), 2));
    }

    public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

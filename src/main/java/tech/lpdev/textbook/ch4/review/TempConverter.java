package tech.lpdev.textbook.ch4.review;

import math.MathUtil;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in fahrenheit: ");
        int f = input.nextInt();
        double c = (f - 32) * (5.0 / 9.0);
        System.out.printf(f + "F in celsius is %.1fC", c);
    }
}

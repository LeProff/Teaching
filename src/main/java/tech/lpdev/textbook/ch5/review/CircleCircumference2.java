package tech.lpdev.textbook.ch5.review;

import math.MathUtil;

import java.util.Scanner;

public class CircleCircumference2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        if (radius < 0) System.out.println("Negative radii are illegal.");
        else {
            double circumference = 2 * radius * Math.PI;
            System.out.println("The circumference of the circle is " + MathUtil.round(circumference, 2));
        }
    }
}

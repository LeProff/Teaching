package tech.lpdev.textbook.ch4.review;


import java.util.Scanner;

public class CircleCircumference1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double circumference = 2 * radius * Math.PI;
        System.out.printf("The circumference of the circle is %.2f", circumference);
    }
}

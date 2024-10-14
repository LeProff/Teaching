package tech.lpdev.textbook.ch5.review;

import java.util.Scanner;

public class Discriminant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant < 0) System.out.println("No roots");
        else if (discriminant == 0) System.out.println("One root");
        else if (discriminant > 0) System.out.println("Two roots");
    }
}

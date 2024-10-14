package tech.lpdev.textbook.ch5.review;

import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the package: ");
        double height = input.nextDouble();
        System.out.print("Enter the width of the package: ");
        double width = input.nextDouble();
        System.out.print("Enter the length of the package: ");
        double length = input.nextDouble();

        if (height <= 10 && width <= 10 && length <= 10) System.out.println("Package is good to go!");
        else System.out.println("Package is to large.");
    }
}

package tech.lpdev.textbook.ch7;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        System.out.println("Convert:");
        System.out.println("1. Inches to Centimeters\t5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters  \t6. Centimeters to Feet");
        System.out.println("3. Yards to Meters      \t7. Meters to Yards");
        System.out.println("4. Miles to Kilometers  \t8. Kilometers to Miles");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> inchesToCentimeters(num);
            case 2 -> feetToCentimeters(num);
            case 3 -> yardsToMeters(num);
            case 4 -> milesToKilometers(num);
            case 5 -> centimetersToInches(num);
            case 6 -> centimetersToFeet(num);
            case 7 -> metersToYards(num);
            case 8 -> kilometersToMiles(num);
        }
    }

    private static void inchesToCentimeters(double inches) {
        System.out.printf("%.0f inches equals %.2f centimeters\n", inches, (inches * 2.54));
    }

    private static void feetToCentimeters(double feet) {
        System.out.printf("%.0f feet equals %.2f centimeters\n", feet, (feet * 30.48));
    }

    private static void yardsToMeters(double yards) {
        System.out.printf("%.0f yards equals %.2f meters\n", yards, (yards / 1.094));
    }

    private static void milesToKilometers(double miles) {
        System.out.printf("%.0f miles equals %.2f kilometers\n", miles, (miles * 1.609));
    }

    private static void centimetersToInches(double centimeters) {
        System.out.printf("%.0f centimeters equals %.2f inches\n", centimeters, (centimeters * 0.393701));
    }

    private static void centimetersToFeet(double centimeters) {
        System.out.printf("%.0f centimeters equals %.2f feet\n", centimeters, (centimeters / 30.48));
    }

    private static void metersToYards(double meters) {
        System.out.printf("%.0f meters equals %.2f yards\n", meters, (meters * 1.094));
    }

    private static void kilometersToMiles(double kilometers) {
        System.out.printf("%.0f kilometers equals %.2f miles\n", kilometers, (kilometers * 0.621371));
    }
}

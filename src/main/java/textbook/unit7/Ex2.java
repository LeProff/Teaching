package textbook.unit7;

import tech.lpdev.utils.MathUtil;

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
        System.out.println(inches + " inches equals " + MathUtil.round((inches * 2.54), 2) + " centimeters");
    }

    private static void feetToCentimeters(double feet) {
        System.out.println(feet + " feet equals " + MathUtil.round((feet * 30.48), 2) + " centimeters");
    }

    private static void yardsToMeters(double yards) {
        System.out.println(yards + " yards equals " + MathUtil.round((yards / 1.094), 2) + " meters");
    }

    private static void milesToKilometers(double miles) {
        System.out.println(miles + " miles equals " + MathUtil.round((miles * 1.609), 2) + " kilometers");
    }

    private static void centimetersToInches(double centimeters) {
        System.out.println(centimeters + " centimeters equals " + MathUtil.round((centimeters / 2.54), 2) + " inches");
    }

    private static void centimetersToFeet(double centimeters) {
        System.out.println(centimeters + " centimeters equals " + MathUtil.round((centimeters / 30.48), 2) + " feet");
    }

    private static void metersToYards(double meters) {
        System.out.println(meters + " meters equals " + MathUtil.round((meters * 1.094), 2) + " yards");
    }

    private static void kilometersToMiles(double kilometers) {
        System.out.println(kilometers + " milometers equals " + MathUtil.round((kilometers / 1.609), 2) + " miles");
    }
}

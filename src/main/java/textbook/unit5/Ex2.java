package textbook.unit5;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter length in centimeters: ");
        double length = input.nextDouble();
        System.out.print("Enter width in centimeters: ");
        double width = input.nextDouble();
        System.out.print("Enter height in centimeters: ");
        double height = input.nextDouble();
        double volume = length * width * height;

        if (weight > 27) {
            if (volume > 100000) System.out.println("To heavy and to big.");
            else System.out.println("To heavy.");
        } else if (volume > 100000) System.out.println("To big.");
        else System.out.println("Good to go!");
    }
}

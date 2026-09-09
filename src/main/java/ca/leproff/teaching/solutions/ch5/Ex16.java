package ca.leproff.teaching.solutions.ch5;

import java.util.Scanner;

public class Ex16   {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        System.out.println("Sine: " + Math.round(Math.sin(Math.toRadians(angle)) * 100.0) / 100.0);
        System.out.println("Cosine: " + Math.round(Math.cos(Math.toRadians(angle)) * 100.0) / 100.0);
        System.out.println("Tangent: " + Math.round(Math.tan(Math.toRadians(angle)) * 100.0) / 100.0);
    }
}

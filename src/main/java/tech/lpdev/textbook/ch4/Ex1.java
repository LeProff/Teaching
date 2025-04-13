package tech.lpdev.textbook.ch4;

import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time less than 4.5 seconds: ");
        double time = input.nextDouble();
        double out = 100 - (4.9 * Math.pow(time, 2));
        System.out.printf("The height of the object is: %.1f meters", out);
    }
}

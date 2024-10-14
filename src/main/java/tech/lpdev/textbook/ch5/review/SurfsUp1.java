package tech.lpdev.textbook.ch5.review;

import java.util.Scanner;

public class SurfsUp1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the wave: ");
        int height = input.nextInt();

        if (height >= 6) System.out.println("Great day for surfing!");
    }
}

package tech.lpdev.textbook.ch7.review;

import java.util.Scanner;

public class DisplayBox2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("would you like to enter a character to use? [y/n]: ");
        String res = input.nextLine();

        if (res.equalsIgnoreCase("y")) {
            System.out.print("Enter a character: ");
            String character = input.nextLine();
            System.out.print("Enter a height: ");
            int height = input.nextInt();
            System.out.print("Enter a width: ");
            int width = input.nextInt();

            drawBox(height, width, character);
        } else {
            System.out.print("Enter a height: ");
            int height = input.nextInt();
            System.out.print("Enter a width: ");
            int width = input.nextInt();

            drawBox(height, width);
        }
    }

    public static void drawBox(int height, int width) {
        for (int i = 0; i < height; i++) {
            drawBar(width);
            System.out.println();
        }
    }

    public static void drawBox(int height, int width, String character) {
        for (int i = 0; i < height; i++) {
            drawBar(width, character);
            System.out.println();
        }
    }

    public static void drawBar(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }

    public static void drawBar(int width, String character) {
        for (int i = 0; i < width; i++) {
            System.out.print(character);
        }
    }
}

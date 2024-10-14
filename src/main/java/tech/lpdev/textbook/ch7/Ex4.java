package tech.lpdev.textbook.ch7;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(drawSpaces(size - i) + drawBar(i) + "*" + drawBar(i));
        }
    }

    private static String drawBar(int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output = output.concat("*");
        }
        return output;
    }

    private static String drawSpaces(int count) {
        String output = "";
        for (int i = 0; i < count - 1; i++) {
            output = output.concat(" ");
        }
        return output;
    }
}

package tech.lpdev.textbook.ch6;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println(sentence.replaceAll(string, ""));
    }
}

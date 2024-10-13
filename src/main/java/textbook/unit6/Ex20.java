package textbook.unit6;


import tech.lpdev.utils.ConsoleColour;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equalsIgnoreCase("a") ||
                    text.substring(i, i + 1).equalsIgnoreCase("e") ||
                    text.substring(i, i + 1).equalsIgnoreCase("i") ||
                    text.substring(i, i + 1).equalsIgnoreCase("o") ||
                    text.substring(i, i + 1).equalsIgnoreCase("u")) count++;
        }
        System.out.println("Number of vowels in " + ConsoleColour.ITALICS + ConsoleColour.YELLOW + text + ConsoleColour.RESET + " is " + count);
    }
}

package textbook.unit6.review;

import java.io.IOException;
import java.util.Scanner;

public class Prompter {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a min: ");
        int min = input.nextInt();
        System.out.print("Enter a max: ");
        int max = input.nextInt();


        while (true) {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            int number = input.nextInt();
            if (number > min && number < max) {
                System.out.println("Number is in range.");
                break;
            }
        }
    }
}

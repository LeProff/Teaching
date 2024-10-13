package textbook.unit4.review;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = input.nextInt();
        int tens = num / 10;
        num = num % 10;
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + num);
    }
}

package tech.lpdev.textbook.ch6;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.print("Enter a number: ");
            num1 = input.nextInt();
            System.out.printf("Enter another number larger than %d: ", num1);
            num2 = input.nextInt();
            if (num1 > num2) System.out.println("The second number must be larger than the first.");
            else break;
        } while (true);

        for (int i = num1; i <= num2; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

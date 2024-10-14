package tech.lpdev.textbook.ch6.review;


import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int max = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 1) sum += i;
        }
        System.out.println(sum);
    }
}

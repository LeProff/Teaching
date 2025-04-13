package tech.lpdev.textbook.ch6.review;

import java.io.IOException;
import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int max = input.nextInt();

        int sum = 0, min = 1;
        while (min <= max) {
            System.out.println(min);
            sum += min;
            min++;
        }
        System.out.println(sum);
    }
}

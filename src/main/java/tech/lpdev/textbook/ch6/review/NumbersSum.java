package tech.lpdev.textbook.ch6.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersSum {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int max = Integer.parseInt(input.readLine());

        int sum = 0, min = 1;
        while (min <= max) {
            System.out.println(min);
            sum += min;
            min++;
        }
        System.out.println(sum);
    }
}

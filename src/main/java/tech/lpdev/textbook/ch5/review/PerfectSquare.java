package tech.lpdev.textbook.ch5.review;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        double res = Math.sqrt(num);
        if (Math.pow((int)res, 2) == num) System.out.println(num + " is a perfect square!");
        else System.out.println(num + " is not a perfect square.");
    }
}

package tech.lpdev.textbook.ch5;


import math.MathUtil;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = MathUtil.random(1, 20);

        System.out.print("Enter a number between 1 & 20: ");
        int guess = input.nextInt();

        System.out.println("Computer: " + secret);
        System.out.println("Player: " + guess);
        if (guess == secret) System.out.println("You win!");
        else System.out.println("You lost.");
    }
}

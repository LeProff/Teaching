package tech.lpdev.textbook.ch5.review;

import math.MathUtil;

import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a minimum: ");
        int min = input.nextInt();
        System.out.print("Enter a maximum: ");
        int max = input.nextInt();

        System.out.println(MathUtil.random(min, max));
    }
}

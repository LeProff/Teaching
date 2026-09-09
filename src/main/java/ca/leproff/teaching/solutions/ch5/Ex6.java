package ca.leproff.teaching.solutions.ch5;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10) + 1, num2 = (int) (Math.random() * 10) + 1;
        int ans = 0;

        int op = (int) (Math.random() * 4) + 1;
        switch (op) {
            case 1 -> {
                System.out.print("What is " + num1 + " + " + num2 + "? ");
                ans = num1 + num2;
            }
            case 2 -> {
                System.out.print("What is " + num1 + " - " + num2 + "? ");
                ans = num1 - num2;
            }
            case 3 -> {
                System.out.print("What is " + num1 + " * " + num2 + "? ");
                ans = num1 * num2;
            }
            case 4 -> {
                System.out.print("What is " + num1 + " / " + num2 + "? ");
                ans = num1 / num2;
            }
        }
        int res = input.nextInt();

        if (res == ans) {
            System.out.println("Correct!");
        } else {
            System.out.println("The correct answer is " + ans);
        }
    }
}

package textbook.unit5;

import tech.lpdev.utils.MathUtil;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = MathUtil.random(1, 10), num2 = MathUtil.random(1, 10);
        int ans = 0;

        int op = MathUtil.random(1, 4);
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

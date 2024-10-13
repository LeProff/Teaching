package textbook.unit6;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single-digit number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another single-digit number: ");
        int num2 = input.nextInt();

        System.out.print(num1 + " " + num2);
        int pos1 = num1, pos2 = num2, next = 0;
        while (true) {
            next = (pos1 + pos2) % 10;
            System.out.print(" " + next);
            if (pos2 == num1 && next == num2) break;
            else {
                pos1 = pos2;
                pos2 = next;
            }
        }
    }
}

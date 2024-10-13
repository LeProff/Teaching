package textbook.unit6;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int counter = 2;
        while (counter <= num) {
            if (num % counter == 0) {
                System.out.print(counter + " ");
                num /= counter;
            } else counter++;
        }
    }
}

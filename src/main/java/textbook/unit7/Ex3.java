package textbook.unit7;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isPrime(num)) System.out.println(num + " is prime");
        else System.out.println(num + " is not prime");
    }

    private static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

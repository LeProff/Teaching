package textbook.unit7;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your total coins:\n");
        System.out.print("Quarters: ");
        int quarters = input.nextInt();
        System.out.print("Dimes: ");
        int dimes = input.nextInt();
        System.out.print("Nickels: ");
        int nickles = input.nextInt();
        System.out.print("Pennies: ");
        int pennies = input.nextInt();

        System.out.println("Total: " + getDollarAmount(quarters, dimes, nickles, pennies));
    }

    private static String getDollarAmount(int q, int d, int n, int p) {
        double total = 0;
        total += q * 0.25;
        total += d * 0.10;
        total += n * 0.05;
        total += p * 0.01;
        return "$" + String.valueOf(total);
    }
}

package textbook.unit4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the change in cents: ");
        int cents = Integer.parseInt(input.readLine());

        int nickels, dimes, quarters;
        quarters = cents / 25;
        cents = cents % 25;
        dimes = cents / 10;
        cents = cents % 10;
        nickels = cents / 5;
        cents = cents % 5;

        System.out.println("The minimum number of coins is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + cents);
    }
}

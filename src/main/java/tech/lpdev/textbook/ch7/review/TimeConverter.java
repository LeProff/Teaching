package tech.lpdev.textbook.ch7.review;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a conversion:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print(">>> ");
        int selection = input.nextInt();

        switch (selection) {
            case 1 -> hoursToMinutes(input);
            case 2 -> daysToHours(input);
            case 3 -> minutesToHours(input);
            case 4 -> hoursToDays(input);
        }
    }

    public static void hoursToMinutes(Scanner input) {
        System.out.print("Enter the number of hours: ");
        int hours = input.nextInt();

        System.out.printf("%d hours = %.2f minutes", hours, (hours * 60.0));
    }

    public static void daysToHours(Scanner input) {
        System.out.print("Enter the number of days: ");
        int days = input.nextInt();

        System.out.printf("%d days = %.2f hours", days, (days * 24.0));
    }

    public static void minutesToHours(Scanner input) {
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        System.out.printf("%d minutes = %.2f hours", minutes, (minutes / 60.0));
    }

    public static void hoursToDays(Scanner input) {
        System.out.print("Enter the number of hours: ");
        int hours = input.nextInt();

        System.out.printf("%d hours = %.2f days", hours, (hours / 24.0));
    }
}

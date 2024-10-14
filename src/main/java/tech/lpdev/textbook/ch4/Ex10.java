package tech.lpdev.textbook.ch4;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate");
        System.out.print("Year: ");
        int birthYear = input.nextInt();
        System.out.print("Month: ");
        int birthMonth = input.nextInt();
        System.out.print("Day: ");
        int birthDay = input.nextInt();

        System.out.println("Enter today's date");
        System.out.print("Year: ");
        int currentYear = input.nextInt();
        System.out.print("Month: ");
        int currentMonth = input.nextInt();
        System.out.print("Day: ");
        int currentDay = input.nextInt();

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        int totalDays = years * 365 + months * 30 + days;
        int hoursAsleep = (totalDays * 24) / 3;

        System.out.println("You have been alive for " + totalDays + " days");
        System.out.println("You have slept for " + hoursAsleep + " hours");
    }
}

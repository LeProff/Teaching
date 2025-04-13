package tech.lpdev.textbook.ch6.review;

import java.io.IOException;
import java.util.Scanner;

public class AccountSetup {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = input.nextLine();

        String password = "";
        while (password.length() < 8) {
            System.out.print("Enter a password that is at least 8 characters long: ");
            password = input.nextLine();
        }
        System.out.println("Your username is " + username.toLowerCase() + " ans your password is " + password.toLowerCase());
    }
}

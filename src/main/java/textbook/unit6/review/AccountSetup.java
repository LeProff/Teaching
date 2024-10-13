package textbook.unit6.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountSetup {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a username: ");
        String username = input.readLine();

        String password = "";
        while (password.length() < 8) {
            System.out.print("Enter a password that is at least 8 characters long: ");
            password = input.readLine();
        }
        System.out.println("Your username is " + username + " ans your password is " + password);
    }
}

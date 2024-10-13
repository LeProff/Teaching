package textbook.unit6.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormalGreeting {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name and and title if applicable: ");
        String name = input.readLine();

        if (name.toLowerCase().startsWith("mr.")) System.out.println("Hello, sir.");
        else if (name.toLowerCase().startsWith("ms.") || name.toLowerCase().startsWith("mrs.") || name.toLowerCase().startsWith("miss")) System.out.println("Hello, ma'am.");
        else System.out.println("Hello " + name);
    }
}

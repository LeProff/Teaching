package textbook.unit4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a three-digit number: ");
        int num = Integer.parseInt(input.readLine());

        int hundreds, tens;
        hundreds = num / 100;
        num = num % 100;
        tens = num / 10;
        num = num % 10;
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + num);
    }
}

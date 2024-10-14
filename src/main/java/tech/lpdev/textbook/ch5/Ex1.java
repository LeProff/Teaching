package tech.lpdev.textbook.ch5;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;

        System.out.print("Enter the number of copies: ");
        int copies = input.nextInt();


        if (copies < 100) price = 0.30;
        else if (copies < 500) price = 0.28;
        else if (copies < 750) price = 0.27;
        else if (copies <= 1000) price = 0.26;
        else price = 0.25;

        System.out.println("Price per copy: " + price);
        System.out.println("Total cost: " + (copies * price));
    }
}

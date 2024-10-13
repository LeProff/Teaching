package textbook.unit6;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = input.next();
        System.out.print("Enter your middle name: ");
        String middle = input.next();
        System.out.print("Enter your last name: ");
        String last = input.next();

        first = first.toLowerCase().substring(0, 1);
        middle = middle.toLowerCase().substring(0, 1);
        last = last.toUpperCase().substring(0, 1);

        System.out.println("Your monogram is: " + first + last + middle);
    }
}

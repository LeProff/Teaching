package textbook.unit5.review;

import java.util.Scanner;

public class Stages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an age: ");
        int age = input.nextInt();

        if (age > 17) System.out.println("Adult");
        else if (age > 12) System.out.println("Teen");
        else if (age > 10) System.out.println("Preteen");
        else if (age > 5) System.out.println("Child");
        else if (age >= 0) System.out.println("Toddler");
        else System.out.println(age + " is not a valid age");
    }
}

package textbook.unit5.review;

import java.util.Scanner;

public class SurfsUp3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the wave: ");
        int height = input.nextInt();

        if (height >= 6) System.out.println("Great day for surfing!");
        else if (height > 3) System.out.println("Go body boarding!");
        else if (height >= 0) System.out.println("Go for a swim.");
        else System.out.println("Whoa! What kind of surf is that?");
    }
}

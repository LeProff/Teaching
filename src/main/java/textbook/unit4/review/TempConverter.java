package textbook.unit4.review;

import tech.lpdev.utils.MathUtil;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in fahrenheit: ");
        int f = input.nextInt();
        double c = (f - 32) * (5.0 / 9.0);
        System.out.println(f + "F in celsius is " + MathUtil.round(c, 1) + "C");
    }
}

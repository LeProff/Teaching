package textbook.unit5;

import tech.lpdev.utils.MathUtil;

import java.util.Scanner;

public class Ex16   {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        System.out.println("Sine: " + MathUtil.round(Math.sin(Math.toRadians(angle)), 2));
        System.out.println("Cosine: " + MathUtil.round(Math.cos(Math.toRadians(angle)), 2));
        System.out.println("Tangent: " + MathUtil.round(Math.tan(Math.toRadians(angle)), 2));
    }
}

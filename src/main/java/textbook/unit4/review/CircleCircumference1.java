package textbook.unit4.review;

import tech.lpdev.utils.MathUtil;

import java.util.Scanner;

public class CircleCircumference1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double circumference = 2 * radius * Math.PI;
        System.out.println("The circumference of the circle is " + MathUtil.round(circumference, 2));
    }
}

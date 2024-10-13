package textbook.unit4.review;

import tech.lpdev.utils.MathUtil;

import java.util.Scanner;

public class GradeAvg2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avg = 0;
        System.out.print("Enter first grade: ");
        avg += input.nextInt();
        System.out.print("Enter second grade: ");
        avg += input.nextInt();
        System.out.print("Enter third grade: ");
        avg += input.nextInt();
        System.out.print("Enter fourth grade: ");
        avg += input.nextInt();
        System.out.print("Enter fifth grade: ");
        avg += input.nextInt();
        System.out.println("The average grade is " + MathUtil.round((avg / 5.0), 1) + "%");
    }
}

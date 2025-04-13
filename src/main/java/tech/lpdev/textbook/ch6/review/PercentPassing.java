package tech.lpdev.textbook.ch6.review;

import math.MathUtil;

import java.io.IOException;
import java.util.Scanner;

public class PercentPassing {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int count = 0, passing = 0;
        while (true) {
            System.out.print("Enter a grade: ");
            int grade = input.nextInt();

            if (grade == 999) break;
            else if (grade > 100 || grade < 0) System.out.println(grade + " is not a valid grade.");
            else {
                count++;
                if (grade > 70) passing++;
            }
        }
        double percent = (double)passing / (double)count;
        System.out.println((100 * MathUtil.round(percent, 3)) + "% of students passed.");
    }
}

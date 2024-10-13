package textbook.unit6.review;

import tech.lpdev.utils.MathUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PercentPassing {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int count = 0, passing = 0;
        while (true) {
            System.out.print("Enter a grade: ");
            int grade = Integer.parseInt(input.readLine());

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

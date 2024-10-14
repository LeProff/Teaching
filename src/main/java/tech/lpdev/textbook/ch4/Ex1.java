package tech.lpdev.textbook.ch4;

import math.MathUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a time less than 4.5 seconds: ");
        double time = Double.parseDouble(input.readLine());
        double out = 100 - (4.9 * Math.pow(time, 2));
        System.out.println("The height of the object is: " + MathUtil.round(out, 1) + " meters");
    }
}

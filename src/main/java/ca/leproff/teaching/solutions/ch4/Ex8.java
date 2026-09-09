package ca.leproff.teaching.solutions.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an integer: ");
        double num1 = Double.parseDouble(input.readLine());
        System.out.print("Enter an second integer: ");
        double num2 = Double.parseDouble(input.readLine());

        double div1 = num1 / num2;
        double mod1 = num1 % num2;
        double div2 = num2 / num1;
        double mod2 = num2 % num1;

        System.out.println(num1 + " / " + num2 + " = " + Math.round(div1));
        System.out.println(num1 + " % " + num2 + " = " + Math.round(mod1));
        System.out.println(num2 + " / " + num1 + " = " + Math.round(div2));
        System.out.println(num2 + " % " + num1 + " = " + Math.round(mod2));
    }
}

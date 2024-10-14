package tech.lpdev.textbook.ch5;

import math.MathUtil;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume;

        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        volume = length * width * height;
        System.out.println("The volume is: " + MathUtil.round(volume, 2));
        System.out.println();

        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        volume = (Math.PI * (Math.pow((2 * radius), 3))) / 6;
        System.out.println("The volume is: " + MathUtil.round(volume, 2));
        System.out.println();

        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        double side = input.nextDouble();
        volume = Math.pow(side, 3);
        System.out.println("The volume is: " + MathUtil.round(volume, 2));
    }
}

package tech.lpdev.textbook.ch4.review;

import java.util.Scanner;

public class Distance2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the runners name: ");
        String name = input.next();
        System.out.print("Enter the distance for the first segment: ");
        double seg1 = input.nextDouble();
        System.out.print("Enter the distance for the second segment: ");
        double seg2 = input.nextDouble();
        System.out.print("Enter the distance for the third segment: ");
        double seg3 = input.nextDouble();
        double totalDistance = seg1 + seg2 + seg3;
        System.out.println(name + " ran a total distance of " + totalDistance);
    }
}

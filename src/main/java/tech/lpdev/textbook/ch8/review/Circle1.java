package tech.lpdev.textbook.ch8.review;

import tech.lpdev.textbook.ch8.review.objects.Circle;

public class Circle1 {

    public static void main(String[] args) {
        Circle spot = new Circle();

        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
    }
}
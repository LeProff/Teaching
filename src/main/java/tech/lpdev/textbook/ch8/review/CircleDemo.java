package tech.lpdev.textbook.ch8.review;

import tech.lpdev.textbook.ch8.review.objects.Circle;

public class CircleDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.setRadius(3);
        System.out.println("Circle radius: " + circle1.getRadius());
        System.out.println("Circle circumference: " + circle1.circumference());

        Circle circle2 = new Circle(5);

        System.out.println("Circle radius: " + circle2.getRadius());
        System.out.println("Circle area: " + circle2.area());
        System.out.println("Circle circumference: " + circle2.circumference());
    }
}

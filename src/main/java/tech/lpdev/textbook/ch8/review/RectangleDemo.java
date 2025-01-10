package tech.lpdev.textbook.ch8.review;

import tech.lpdev.textbook.ch8.review.objects.Rectangle;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);

        System.out.println("Rectangle length: " + rect.getLength());
        System.out.println("Rectangle width: " + rect.getWidth());
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Rectangle perimeter: " + rect.perimeter());
    }
}

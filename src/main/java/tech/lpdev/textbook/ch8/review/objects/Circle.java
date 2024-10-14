package tech.lpdev.textbook.ch8.review.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

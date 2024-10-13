package textbook.unit9.review.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

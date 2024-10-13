package textbook.unit9.review.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Disk extends Circle{
    private double height;

    public Disk(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }

    public double surfaceArea() {
        return (2 * Math.PI * getRadius() * height) + (2 * area());
    }
}

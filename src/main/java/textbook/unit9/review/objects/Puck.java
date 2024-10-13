package textbook.unit9.review.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Puck extends Disk{
    private double weight;
    private boolean standard = false, youth = false;

    public Puck(double weight) {
        super(1.5, 1);
        this.weight = weight;
        if (weight >= 4 && weight <= 4.5) youth = true;
        else if (weight >= 5 && weight <= 5.5) standard = true;
    }

    public String getDivision() {
        if (weight >= 4 && weight <= 4.5) return "Youth";
        if (weight >= 5 && weight <= 5.5) return "Standard";
        return "Illegal";
    }

    @Override
    public String toString() {
        return "The puck has a radius of " + getRadius() + ", a height of " + getHeight() + " and weights " + weight;
    }

    public boolean equals(Puck puck) {
        return puck.getWeight() == weight;
    }
}

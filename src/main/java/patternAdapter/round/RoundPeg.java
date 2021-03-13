package patternAdapter.round;

/**
 * RoundPegs are compatible with RoundHoles.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

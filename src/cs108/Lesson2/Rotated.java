package cs108.Lesson2;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Rotated<ColorRGB> implements Image<ColorRGB> {
    private final Image<ColorRGB> image;
    private final double angleRad;

    public Rotated(Image<ColorRGB> image, double angleDeg) {
        this.image = image;
        this.angleRad = convertDegToRad(angleDeg);
    }

    public Rotated(Image<ColorRGB> image) {
        this.image = image;
        this.angleRad = 0;
    }

    private double convertDegToRad(double angle) {
        return angle * Math.PI / 180;
    }

    @Override
    public ColorRGB apply(double x, double y) {
        return image.apply((x * cos(angleRad)) + (y * sin(angleRad)),
                            (-x * sin(angleRad)) + (y * cos(angleRad)));
    }
}

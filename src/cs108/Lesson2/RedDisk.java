package cs108.Lesson2;

import static java.lang.Math.sqrt;

public final class RedDisk implements Image<ColorRGB> {
    public static final Image<ColorRGB> IMAGE = new RedDisk();
    
    @Override
    public ColorRGB apply(double x, double y) {
        double r = sqrt(x * x + y * y);
        return r <= 1d ? ColorRGB.RED : ColorRGB.WHITE;
    }
}
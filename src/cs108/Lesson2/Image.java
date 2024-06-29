package cs108.Lesson2;

/**
 * Une image continue et infinie, représentée par une fonction associant une
 * couleur à chaque point du plan.
 */

public interface Image<ColorRGB> {
    ColorRGB apply(double x, double y);
}

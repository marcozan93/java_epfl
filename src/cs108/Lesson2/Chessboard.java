package cs108.Lesson2;

import static java.lang.Math.floor;

public class Chessboard implements Image<ColorRGB> {
    private final ColorRGB color1;
    private final ColorRGB color2;
    private final int width;

    public static final Image<ColorRGB> IMAGE = new Chessboard(1, ColorRGB.WHITE, ColorRGB.BLACK);

    public Chessboard(int width, ColorRGB color1, ColorRGB color2) {
        if (width <= 0)
            throw new IllegalArgumentException("invalid width: " + width);

        this.color1 = color1;
        this.color2 = color2;
        this.width = width;
    }

    public Chessboard(ColorRGB color1, ColorRGB color2) {
        this.color1 = color1;
        this.color2 = color2;
        this.width = 1;
    }

    public Chessboard() {
        this(1, ColorRGB.WHITE, ColorRGB.BLACK);
    }

    @Override
    public ColorRGB apply(double x, double y) {
        double r = floor(x*width) + floor(y*width);
        return r%2 == 0 ? color1 : color2;
    }
}

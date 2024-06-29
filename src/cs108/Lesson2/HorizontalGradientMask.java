package cs108.Lesson2;

public class HorizontalGradientMask implements Image<Double> {

    public static final Image<Double> IMAGE =
            new HorizontalGradientMask();


    @Override
    public Double apply(double x, double y) {
        return Math.max(0, Math.min((x + 1d) / 2d, 1d));
    }
}

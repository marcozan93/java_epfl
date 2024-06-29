package cs108.Lesson2;

public final class Mysterious<ColorRGB> implements Image<ColorRGB> {
    private final Image<ColorRGB> image;

    public Mysterious(Image<ColorRGB> image) {
        this.image = image;
    }

    @Override
    public ColorRGB apply(double x, double y) {
        return image.apply(x * 2, y);
    }
}

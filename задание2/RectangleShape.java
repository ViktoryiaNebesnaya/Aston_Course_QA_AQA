public class RectangleShape extends AbstractGeometricShape {
    private final double width;
    private final double height;

    public RectangleShape(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new OutOfRangeException("Ширина и высота должны быть положительными");
        }
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }
}

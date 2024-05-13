public class CircleShape extends AbstractGeometricShape {
    private final double radius;

    public CircleShape(double radius) {
        if (radius <= 0) {
            throw new OutOfRangeException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

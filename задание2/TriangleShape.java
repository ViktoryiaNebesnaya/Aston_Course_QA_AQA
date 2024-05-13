public class TriangleShape extends AbstractGeometricShape {
    private final double side1;
    private final double side2;
    private final double side3;

    public TriangleShape(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new OutOfRangeException("Стороны должны быть положительными");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

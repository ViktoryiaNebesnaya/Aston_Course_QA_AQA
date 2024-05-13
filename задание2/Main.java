public class Main {
    public static void main(String[] args) {
        try {
            GeometricShape circle = new CircleShape(5.0);
            circle.setFillColor("синий");
            circle.setBorderColor("черный");
            System.out.println(circle);

            GeometricShape rectangle = new RectangleShape(4.0, 6.0);
            rectangle.setFillColor("зеленый");
            rectangle.setBorderColor("красный");
            System.out.println(rectangle);

            GeometricShape triangle = new TriangleShape(3.0, 4.0, 5.0);
            triangle.setFillColor("желтый");
            triangle.setBorderColor("черный");
            System.out.println(triangle);
        } catch (OutOfRangeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

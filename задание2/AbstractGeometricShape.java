public abstract class AbstractGeometricShape implements GeometricShape {
    protected String fillColor;
    protected String borderColor;

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public String toString() {
        return String.format("%s: Периметр = %.2f, Площадь = %.2f, Цвет заливки = %s, Цвет границы = %s",
                getClass().getSimpleName(), calculatePerimeter(), calculateArea(), fillColor, borderColor);
    }
}

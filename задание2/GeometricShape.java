public interface GeometricShape {
    double calculatePerimeter();
    
    double calculateArea();
    
    String getFillColor();
    void setFillColor(String color);
    
    String getBorderColor();
    void setBorderColor(String color);
    
    String toString();
}

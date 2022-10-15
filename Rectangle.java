package module8;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.shapeName = "Rectangle";
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return length + width;
    }
}

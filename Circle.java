package module8;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.shapeName = "Circle";
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

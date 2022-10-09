package module8;

public class Quad extends Shape {
    double length;

    public Quad(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double perimeter() {
        return length * 4;
    }
}

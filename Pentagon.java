package module8;

public class Pentagon extends Shape {
    double length;

    public Pentagon(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return (5 * length * length) / (4 * Math.sqrt(5 - 2 * Math.sqrt(5)));
    }

    @Override
    public double perimeter() {
        return 5 * length;
    }
}

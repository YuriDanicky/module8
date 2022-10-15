package module8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape pentagon = new Pentagon(8.0);
        Shape quad = new Quad(10.5);
        Shape rectangle = new Rectangle(18.3, 20.4);
        Shape triangle = new Triangle(4.5, 12.3, 8.5);

        ShapePrinter.shapePrint(circle);
        System.out.println("circle area = " + circle.area());
        System.out.println("circle perimeter = " + circle.perimeter());

        ShapePrinter.shapePrint(pentagon);
        System.out.println("pentagon area = " + pentagon.area());
        System.out.println("pentagon.perimeter() = " + pentagon.perimeter());

        ShapePrinter.shapePrint(quad);
        System.out.println("quad.area() = " + quad.area());
        System.out.println("quad.perimeter() = " + quad.perimeter());

        ShapePrinter.shapePrint(rectangle);
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());

        ShapePrinter.shapePrint(triangle);
        System.out.println("triangle.area() = " + triangle.area());
        System.out.println("triangle.perimeter() = " + triangle.perimeter());
    }
}

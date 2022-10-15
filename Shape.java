package module8;

public abstract class Shape implements Calculate {

    String shapeName = "Shape";

    void printName() {
        System.out.println("this shape is a " + shapeName);
    }
}

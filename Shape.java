package module8;

public abstract class Shape implements Calculate {
    void printName() {
        System.out.println("this shape is a " + getClass().getSimpleName());
    }
}

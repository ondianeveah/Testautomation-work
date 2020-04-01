package TestAutomation;

public class OverrideTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square.");
    }
    public static void testOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(36);
        rectangle.setWidth(57);
        System.out.println(rectangle.calculatePerimeter());
        Square square = new Square();
        square.getSides();
        square.setLength(79);
        System.out.println(square.calculatePerimeter());
    }
}

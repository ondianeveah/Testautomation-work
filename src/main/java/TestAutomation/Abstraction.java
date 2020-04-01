package TestAutomation;

public class Abstraction {
    public static void main(String[] args) {
        Shape triangle = new Triangle(69, 5);
        triangle.print();
        System.out.println(triangle.calculateArea());;
    }
}

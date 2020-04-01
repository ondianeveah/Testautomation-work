package TestAutomation;

public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle(double height, double base){
        setBase(base);
        setHeight(height);
    }
    @Override
    double calculateArea() {
        return (height * base) / 2 ;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}

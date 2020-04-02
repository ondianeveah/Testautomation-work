package TestCases;

public class Calculator {

    public int add(int A, int B){
        return A + B;
        //red, green, refactor
    }

    public int substract(int A, int B){
        return A - B;
    }

    public int multiply(int A, int B){
        return A * B;
    }

    public int divide(int A, int B){
        return A / B;
    }

    public double exponent(int A, int B){
        return Math.pow(A,B);
    }

    public int square(int A){
        int square = A * A;
        return square;
    }

    public double squareRoot(double A){
        return Math.sqrt(A);
    }

    public double sin(double a){
        return Math.sin(a);
    }
}

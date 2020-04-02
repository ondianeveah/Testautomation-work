import TestCases.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Suite;

public class CalculatorTest {

    @Test
    public void addTest(){
    //Given
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;

        int expected = 3;

    //When
        int actual = calculator.add(x,y);
    //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addSubtractTest(){
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 5;

        int expected = 5;

        int actual = calculator.substract(x,y);

        Assert.assertEquals(expected,actual);

        //mutiply,divide,exponent
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int x = 50;
        int y = 2;

        int expected = 100;

        int actual = calculator.multiply(x,y);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int x = 50;
        int y = 2;

        int expected = 25;

        int actual = calculator.divide(x,y);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void exponentTest(){
        Calculator calculator = new Calculator();
        int x = 50;
        int y = 2;

        double expected = 2500;

        double actual = calculator.exponent(x,y); //X^Y

        Assert.assertEquals(expected,actual, 0.0000001);
    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator();
        int x = 35;

        int expected = 1225;

        int actual = calculator.square(x);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        int x = 4;

        int expected = 2;


        double actual = calculator.squareRoot(x);

        Assert.assertEquals(expected,actual, 0.000001);
    }

    @Test
    public void sinTest(){
        Calculator calculator = new Calculator();
        double degrees = 90.0;

        double radians = Math.toRadians(degrees);

        double expected = 1.0;

        double actual = calculator.sin(radians);

        Assert.assertEquals(expected,actual,.100000);
    }

}

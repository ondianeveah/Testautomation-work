import Lab.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentTester {

    @Test
    public void getExamScoresTest(){
        //Given
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] scores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, scores);

        //When
        String expected = "Exam scores:\n" +
                "\tExam 1 -> 100\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96\n";
       String actual = student.getExamScores();
        //Then
        Assert.assertEquals(expected,actual);
        System.out.println(student.getExamScores());
    }

    @Test
    public void addExamScoreTest(){
        //Given
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        //When
        String expected = "Exam scores:\n" +
                "\tExam 1 -> 100";

       String actual = student.addExamScore(100.0);

       Assert.assertEquals(expected,actual);

    }

    @Test
    public void setExamScoreTest(){
        //Given
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] examScores = {150.0};
        Student student = new Student(firstName, lastName, examScores);

        //When
        String expected = "Exam scores:\n" +
                "\tExam 1 -> 150\n";

        String actual = student.getExamScores();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getAverageTest(){
        //Given
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] scores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, scores);

        //When
        double output = student.getAverageExamScore();
        //Then

        System.out.println(output);
    }

    @Test
    public void toStringTest(){
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] scores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, scores);

        String output = student.toString();

        System.out.println(output);
    }

}

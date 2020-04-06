import Lab.Student;
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
        String output = student.getExamScores();
        System.out.println(output);

        //Then
    }

    @Test
    public void addExamScoreTest(){
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        student.addExamScore(100.0);
        String output = student.getExamScores();
        System.out.println(output);
    }

    @Test
    public void setExamScoreTest(){
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);

        student.setExamScores(1, 150.0);
        String output = student.getExamScores();
        System.out.println(output);

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

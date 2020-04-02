package TestAutomation;

import java.util.Arrays;

public class StudentTester {
    public static void main(String[] args) {
        Double [] examScores = {75.0, 88.0, 100.0, 85.0};
        Student student = new Student("Ondia", "Brown", examScores);
        System.out.println(student.toString());
    }
}

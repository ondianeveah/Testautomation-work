import Lab.Classroom;
import Lab.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTester {

    @Test
    public void constructorTest(){
        Classroom classroom = new Classroom();
        Student[] expected = new Student[30];
        Student[] actual = classroom.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void constructorTest2(){
        Double[] exams = {20.0};
        Student student1 = new Student("Ondia", "Brown", exams);
        Student student2 = new Student("Madison", "Semans", exams);
        Student student3 = new Student("Remy", "Smith", exams);
        Student[] students = {student1, student2, student3};
        Classroom classroom = new Classroom(students);
        Student[] actual = classroom.getStudents();
        Assert.assertArrayEquals(students, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        Double[] s1Scores = { 100.0, 98.0 };
        Double[] s2Scores = { 75.0 , 55.0 };

        Student student1 = new Student("student", "one", s1Scores);
        Student student2 = new Student("student", "two", s2Scores);

        Student[] students = {student1,student2};
        Classroom classroom = new Classroom(students);

        Double actual = classroom.getAverageExamScore();

        System.out.println(actual);

    }

    @Test
    public void addStudentTest(){
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);

        Double[] examScores = { 75.0, 100.0, 67.0, 73.0 };
        Student student = new Student("Ondia", "Brown", examScores);

        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);

        classroom.addStudent(student);

        Student[] postEnrollment = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);


        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudentTest(){
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);

        Double[] examScores = { 75.0, 100.0, 67.0, 73.0 };

        Student student2 = new Student("Brown", "Ondia", examScores);

        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);

        classroom.removeStudent(student2);

        Student[] postEnrollment = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }



}

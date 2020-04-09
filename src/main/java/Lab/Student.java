package Lab;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double [] examScores){
        this.firstName = firstName;
        this.lastName = firstName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getExamScores() {
        String scores = "Exam scores:\n";
        for(int x = 0; x <examScores.size(); x++){
            scores += "\tExam " + (x + 1) + " -> " + examScores.get(x).intValue() + "\n";
                    //lamda expressions - separates the parameters from implementation
            //(Parameters) -> {Body}
        }
        return scores;
    }

    public double setExamScores(int evanNumber, double newScore) {
        examScores.remove(evanNumber - 1);
        examScores.add(evanNumber - 1, newScore);
        return newScore;
    }

    public String addExamScore(double examScore){
        String scores = "Exam scores:\n";
        examScores.add(examScore);
        return scores;
    }

    public double getAverageExamScore(){
        Double examScore = 0.0;
        Double average = 0.0;
        for(int x = 0; x < examScores.size(); x++){
            examScore += examScores.get(x);
            average = examScore / examScores.size();
            //sum of numbers = examScore
            //by the total number of values in set = examScores.size();
        }
        return average;
    }

    public String toString(){
        String str = "Student Name: " + firstName + " " + lastName + "\n" +
                "Average Score: " + getAverageExamScore() + "\n" +
                getExamScores();
        return str;
    }

    }


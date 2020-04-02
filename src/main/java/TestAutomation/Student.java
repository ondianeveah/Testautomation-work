package TestAutomation;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] examScores;
    private Double numberOfExamsTaken;


    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = firstName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getExamScores() {
        for (int x = 0; x < examScores.length; x++){

        }
        return examScores;
    }

    public Double getNumbersOfExamsTaken(){
        return numberOfExamsTaken;
    }

  //  public void addExamScore(double examScore){
     //   examScores.ad
  //  }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + Arrays.toString(examScores) +
                '}';
    }
}

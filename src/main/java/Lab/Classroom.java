package Lab;

import java.util.Arrays;

public class Classroom {
    //property
    private Student[] students;

    //constructor
    public Classroom(Student[] students) {
        this.students = students;
    }

    //overloaded constructor
    public Classroom(Integer maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom() {
        //comes from this.students ^
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student student : students) {
            sum += student.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student) {
        boolean inserted = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            Student[] tempArray = Arrays.copyOf(students, students.length + 1);
            tempArray[tempArray.length - 1] = student;
        }
    }

}

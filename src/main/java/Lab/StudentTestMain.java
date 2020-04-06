package Lab;

public class StudentTestMain {
    public static void main(String[] args) {
        String firstName = "Ondia";
        String lastName = "Brown";
        Double [] scores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, scores);
        String output = student.getExamScores();
        System.out.println(output);


        student.addExamScore(89.0);
        String output2 = student.getExamScores();
        System.out.println(output2);

        student.setExamScores(1, 150.0);
        String output3 = student.getExamScores();
        System.out.println(output3);

        double output4 = student.getAverageExamScore();
        System.out.println(output4);

        String output5 = student.toString();
        System.out.println(output5);

    }
}

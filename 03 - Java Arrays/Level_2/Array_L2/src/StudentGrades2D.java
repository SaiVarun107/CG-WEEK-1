import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                while (true) {
                    System.out.print(subject + " marks (0-100): ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] >= 0 && marks[i][j] <= 100) {
                        break;
                    }
                    System.out.println("Invalid marks! Enter again.");
                }
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = totalMarks / 3.0;
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        System.out.println("\nStudent Results:");
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d        %d        %d         %d     %.2f%%        %c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        input.close();
    }
}

import java.util.*;
public class StudentScoreCard {
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = 40 + (int)(Math.random() * 61);
            marks[i][1] = 40 + (int)(Math.random() * 61);
            marks[i][2] = 40 + (int)(Math.random() * 61);
        }
        return marks;
    }
    public static double[][] calculateScores(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static String[] calculateGrades(double[][] scores) {
        int n = scores.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double percentage = scores[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
    public static void displayScoreCard(int[][] marks, double[][] scores, String[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t\t%\t\tGrade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                    (i + 1),
                    marks[i][0], marks[i][1], marks[i][2],
                    scores[i][0], scores[i][1], scores[i][2],
                    grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] scores = calculateScores(marks);
        String[] grades = calculateGrades(scores);
        displayScoreCard(marks, scores, grades);
        sc.close();
    }
}
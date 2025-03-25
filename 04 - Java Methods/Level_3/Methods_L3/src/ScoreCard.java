import java.util.Scanner;
public class ScoreCard {
    public static int[][] getStudentMarks(int numStudents) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            scores[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            scores[i][1] = sc.nextInt();
            System.out.print("Math: ");
            scores[i][2] = sc.nextInt();
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\t\tChem\tMath\tTotal\tAvg\t\tPercent");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t2\t" + scores[i][2] + "\t"
                    + (int) results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        int[][] scores = getStudentMarks(num);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;
public class Matrix {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // 0 to 9
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }
    public static int[][] transposeMatrix(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];
        return result;
    }
    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }
    public static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }
    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = A[1][1] / (double) det;
        inverse[0][1] = -A[0][1] / (double) det;
        inverse[1][0] = -A[1][0] / (double) det;
        inverse[1][1] = A[0][0] / (double) det;
        return inverse;
    }
    public static void displayMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
    public static void displayMatrixDouble(double[][] A) {
        for (double[] row : A) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = createRandomMatrix(2, 2);
        int[][] B = createRandomMatrix(2, 2);
        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("A x B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("Determinant of A: " + determinant2x2(A));

        double[][] inv = inverse2x2(A);
        if (inv != null) {
            System.out.println("Inverse of A:");
            displayMatrixDouble(inv);
        } else {
            System.out.println("Matrix A is not invertible.");
        }
        sc.close();
    }
}

import java.util.Scanner;
    public class MultiDimensionalArray {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = input.nextInt();
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter elements of the 2D array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = input.nextInt();
                }
            }
            int[] array = new int[rows * cols];
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[index++] = matrix[i][j];
                }
            }
            System.out.println("\nOriginal 2D Array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nCopied 1D Array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            input.close();
        }
    }

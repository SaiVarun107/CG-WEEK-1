import java.util.Scanner;
public class SumNaturalNumbers {
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int sumRecursion = sumUsingRecursion(n);
            int sumFormula = sumUsingFormula(n);
            System.out.println("Sum using recursion: " + sumRecursion);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both computations give the same result: " + (sumRecursion == sumFormula));
        } else {
            System.out.println("Please enter a number greater than 0.");
        }
        scanner.close();
    }
}

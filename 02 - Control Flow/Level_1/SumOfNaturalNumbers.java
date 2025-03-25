import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}

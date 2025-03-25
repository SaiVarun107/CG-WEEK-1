import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int total = 0;
            
            // Using for loop to calculate sum
            for (int i = 1; i <= n; i++) {
                total += i;
            }

            // Using formula to calculate sum
            int formula = (n * (n + 1)) / 2;

            System.out.println("Sum using for loop: " + total);
            System.out.println("Sum using formula: " + formula);
            System.out.println(total == formula ? "Both computations match!" : "Computations do not match.");
        }
        input.close();
    }
}

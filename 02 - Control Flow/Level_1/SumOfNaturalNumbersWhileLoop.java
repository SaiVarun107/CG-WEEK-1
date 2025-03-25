import java.util.Scanner;

public class SumOfNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int total = 0, i = 1;
            while (i <= n) {
                total += i++;
            }

            int formula = (n * (n + 1)) / 2;

            System.out.println("Sum using while loop: " + total);
            System.out.println("Sum using formula: " + formula);
            System.out.println(total == formula ? "Both computations match!" : "Computations do not match.");
        }
        input.close();
    }
}

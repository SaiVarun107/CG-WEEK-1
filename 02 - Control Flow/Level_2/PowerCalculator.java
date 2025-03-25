import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = input.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int power = input.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        input.close();
    }
}

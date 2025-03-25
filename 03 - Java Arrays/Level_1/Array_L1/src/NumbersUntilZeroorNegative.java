import java.util.Scanner;
public class NumbersUntilZeroorNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int temp = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }
            numbers[temp] = num;
            temp++;
            if (temp == 10) {
                break;
            }
        }
        for (int i = 0; i < temp; i++) {
            total += numbers[i];
        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < temp; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum of numbers: " + total);
        input.close();
    }
}

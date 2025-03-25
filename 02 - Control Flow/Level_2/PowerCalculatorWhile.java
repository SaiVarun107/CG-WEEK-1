import java.util.Scanner;
public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + "^" + power + " = " + result);
        }
        input.close();
    }
}

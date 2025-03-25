import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.print("Enter a number : ");
        number = input.nextDouble();
        while (number != 0) {
            total = total + number;
            System.out.print("Enter a number : ");
            number = input.nextDouble();
        }
        System.out.println("The total sum is: " + total);
        input.close();
    }
}

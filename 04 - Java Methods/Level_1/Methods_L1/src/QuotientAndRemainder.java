import java.util.Scanner;
public class QuotientAndRemainder {
    public static void findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        if (divisor != 0) {
            findRemainderAndQuotient(number, divisor);
        } else {
            System.out.println("Divisor cannot be zero.");
        }
        scanner.close();
    }
}

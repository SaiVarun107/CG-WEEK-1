import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        double result = 0;
        boolean validOperation = true;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of (+, -, *, /)");
                validOperation = false;
        }
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        input.close();
    }
}

import java.util.Scanner;
public class NumberCheck5 {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int testNumber = scanner.nextInt();
        System.out.println("Number: " + testNumber);
        System.out.println("Is Prime? " + isPrime(testNumber));
        System.out.println("Is Neon? " + isNeon(testNumber));
        System.out.println("Is Spy? " + isSpy(testNumber));
        System.out.println("Is Automorphic? " + isAutomorphic(testNumber));
        System.out.println("Is Buzz? " + isBuzz(testNumber));
        scanner.close();
    }
}
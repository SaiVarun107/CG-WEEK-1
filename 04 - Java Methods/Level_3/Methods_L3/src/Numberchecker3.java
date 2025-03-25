import java.util.Scanner;
public class Numberchecker3 {
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }
    public static int[] getDigitsArray(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int)Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = getDigitsArray(number);
        int count = countDigits(number);
        int sum = sumOfDigits(digits);
        int sumSquares = sumOfSquaresOfDigits(digits);
        boolean harshad = isHarshad(number, digits);
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Count: " + count);
        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + sumSquares);
        System.out.println("Is Harshad Number? " + harshad);
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + ": " + row[1]);
            }
        }
        scanner.close();
    }
}
import java.util.Scanner;
public class NumberChecker {
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        int i = 0;
        while (i < digits.length) {
            int p = 1;
            int j = 0;
            while (j < power) {
                p = p * digits[i];
                j++;
            }
            sum = sum + p;
            i++;
        }
        return sum == number;
    }
    public static void findTwoLargest(int[] digits) {
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > max1) {
                max2 = max1;
                max1 = digits[i];
            } else if (digits[i] > max2 && digits[i] != max1) {
                max2 = digits[i];
            }
        }
        System.out.println("Largest Digit: " + max1);
        System.out.println("Second Largest Digit: " + max2);
    }
    public static void findTwoSmallest(int[] digits) {
        int min1 = 10;
        int min2 = 10;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < min1) {
                min2 = min1;
                min1 = digits[i];
            } else if (digits[i] < min2 && digits[i] != min1) {
                min2 = digits[i];
            }
        }
        System.out.println("Smallest Digit: " + min1);
        System.out.println("Second Smallest Digit: " + min2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);
        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        if (isDuckNumber(digits)) {
            System.out.println("It is a Duck Number");
        } else {
            System.out.println("It is NOT a Duck Number");
        }
        if (isArmstrongNumber(number, digits)) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is NOT an Armstrong Number");
        }
        findTwoLargest(digits);
        findTwoSmallest(digits);
    }
}

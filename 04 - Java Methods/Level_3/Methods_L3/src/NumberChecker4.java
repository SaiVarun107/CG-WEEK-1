import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker4 {
    public static int[] getDigitsArray(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        boolean palindrome = isPalindrome(digits);
        boolean duck = isDuckNumber(digits);
        System.out.println("Original Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome? " + palindrome);
        System.out.println("Is Duck Number? " + duck);
        scanner.close();
    }
}

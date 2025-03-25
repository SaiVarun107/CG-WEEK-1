import java.util.Scanner;
public class NumberChecker6 {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum == number;
    }
    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }
    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = getFactors(number);
        System.out.println("Factors:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number? " + isPerfect(number, factors));
        System.out.println("Is Abundant Number? " + isAbundant(number, factors));
        System.out.println("Is Deficient Number? " + isDeficient(number, factors));
        System.out.println("Is Strong Number? " + isStrongNumber(number));
        scanner.close();
    }
}

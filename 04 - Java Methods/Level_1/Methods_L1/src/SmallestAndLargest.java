import java.util.Scanner;
public class SmallestAndLargest {
    public static void findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {        
            largest = number3;
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        findSmallestAndLargest(number1, number2, number3);
        scanner.close();
    }
}

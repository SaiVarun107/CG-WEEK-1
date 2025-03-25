import java.util.Scanner;
public class FirstSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int num1,num2,num3;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        boolean Smallest = (num1 < num2) && (num1 < num3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        scanner.close();
    }
}

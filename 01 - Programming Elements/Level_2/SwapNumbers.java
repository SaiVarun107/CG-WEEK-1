import java.util.Scanner;
public class SwapNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter Number 1: ");
		num1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		num2 = input.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.printf("The swapped numbers are %d and %d. ",num1,num2);
		
		input.close();
	}
}
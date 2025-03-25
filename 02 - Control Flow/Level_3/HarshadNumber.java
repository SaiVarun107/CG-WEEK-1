import java.util.Scanner;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = input.nextInt();
		int temp = num , sum = 0;
		while(temp != 0) {
			int digit = temp%10;
			sum = sum + digit;
			temp = temp / 10;
		}
		if (num%sum == 0) {
			System.out.print("The Number is Harshad Number. ");
		} else {
			System.out.print("The Number is not Harshad Number. ");
		}
		input.close();
	}
}
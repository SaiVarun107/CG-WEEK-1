import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number ; ");
		int num = input.nextInt();
		for (int i = 6; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		input.close();
	}
}
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = input.nextInt();
		if (num <= 0) {
			System.out.print(" Enter Natural Number . ");
		} else {
			for( int i = 1; i <= num; num--)
			if( num % 2 == 0) {
				System.out.println(num + " = Even Number");
			} else {
				System.out.println(num + " = Odd Number");
			}
			input.close();
		}
	}
}
import java.util.Scanner;
public class DecrementCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int i = input.nextInt();
		
		while (i >= 1)
		{
			System.out.println("Counter : " + i );
			i--;
		}
		input.close();
	}
}
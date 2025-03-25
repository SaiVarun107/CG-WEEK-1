import java.util.Scanner;
public class AbundantNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = input.nextInt();
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		if(sum > num) {
			System.out.print("The Number " + num + " is Abundant Number.");
		} else {
			System.out.print("The Number " + num + " is not Abundant Number.");
		}
	}
}
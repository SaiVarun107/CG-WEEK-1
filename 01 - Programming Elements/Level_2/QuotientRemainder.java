import java.util.Scanner;
public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1,n2,q,r;
		System.out.print("Enter the number 1: ");
		n1 = input.nextDouble();
		System.out.print("Enter the number 2: ");
		n2 = input.nextDouble();
		q = n1 / n2;
		r = n1 % n2;
		System.out.printf("The Quotient is %.4f and Reminder is %.4f of two number %.4f and %.4f",q,r,n1,n2);
		
	}
}
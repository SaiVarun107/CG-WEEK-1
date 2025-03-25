import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, o1, o2, o3, o4;
		System.out.print(" a : ");
		a = input.nextInt();
		System.out.print(" b : ");
		b = input.nextInt();
		System.out.print(" c : ");
		c = input.nextInt();
		o1 = a + b * c;
		o2 = a * b + c;
		o3 = c + a / b;
		o4 = a % b + c;
		System.out.printf("The results of Int Operations are %d,%d,%d,%d ",o1,o2,o3,o4);
		
	}
}
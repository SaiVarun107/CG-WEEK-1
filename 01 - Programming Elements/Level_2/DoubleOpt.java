import java.util.Scanner;
public class DoubleOpt {
	public static void main(String[] args) {
		double a, b, c, o1, o2, o3, o4;
		Scanner input = new Scanner(System.in);
		System.out.print(" a : ");
		a = input.nextDouble();
		System.out.print(" b : ");
		b = input.nextDouble();
		System.out.print(" c : ");
		c = input.nextDouble();
		o1 = a + b * c;
		o2 = a * b + c;
		o3 = c + a / b;
		o4 = a % b + c;
		System.out.printf("The results of Double Operations are %.3f, %.3f, %.3f, %.3f ",o1,o2,o3,o4);
	}
}
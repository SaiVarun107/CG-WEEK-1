import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args) {
		double num1,num2,add,sub,mul,div;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		num1 = input.nextDouble();
		System.out.print("Enter the Number 2 : ");
		num2 = input.nextDouble();
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.1f and %.1f is %.1f, %.1f, %.1f, and %.5f",num1,num2,add,sub,mul,div);
		
	}
}
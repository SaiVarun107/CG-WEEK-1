import java.util.Scanner;
public class BonusSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number Of Years Serviced : ");
		double years = input.nextDouble();
		System.out.print("Enter the Salary : ");
		double salary = input.nextDouble();
		if (years >= 5) {
			double bonus = (double) (0.05 * salary);
			double finalSalary = salary + bonus;
			System.out.print("The Salary of the Employee is " + finalSalary + ".");
			System.out.print(" The Bonus Amount is " + bonus );
		} else {
			System.out.print("The Salary of the Employee  is " + salary + ".");
		}
	}
}
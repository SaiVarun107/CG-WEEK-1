import java.util.Scanner;
public class TotalIncome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salary,bonus,TotalIncome;
		System.out.print("Salary: ");
		salary = input.nextDouble();
		System.out.print("Bonus: ");
		bonus = input.nextDouble();
		TotalIncome = salary + bonus;
		System.out.printf("The Salary is INR %.3f and the Bonus is INR %.3f. Hence Total Income is INR %.3f",salary,bonus,TotalIncome);
	}
}
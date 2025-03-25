import java.util.Scanner;
public class StudentFee {
	public static void main(String[] args) {
		double fee,discountpercentage,discount,discountedfee;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Fee : ");
		fee = input.nextDouble();
		System.out.print("Enter the Discount Percentage : ");
		discountpercentage = input.nextDouble();
		input.close();
		discount = (fee * discountpercentage) / 100;
		discountedfee = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final Discounted fee in INR " + discountedfee);
	}
}
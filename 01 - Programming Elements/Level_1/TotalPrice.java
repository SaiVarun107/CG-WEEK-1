import java.util.Scanner;
public class TotalPrice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double unitprice,quantity,totalprice;
		System.out.print("Enter the unit price: ");
		unitprice = input.nextDouble();
		System.out.print("Enter the Quantity of units: ");
		quantity = input.nextDouble();
		totalprice = quantity * unitprice;
		System.out.printf("The total purchase price is INR %.3f if the quantity is %.2f and unit price is INR %.4f ",totalprice,quantity,unitprice);
	}
}

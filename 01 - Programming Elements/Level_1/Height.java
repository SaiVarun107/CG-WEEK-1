import java.util.Scanner;
public class Height {
	public static void main(String[] args) {
		double height,inch,heightininch,heightinfoot;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Height in cms : ");
		height = input.nextDouble();
		input.close();
		inch = height / 2.54;
		heightinfoot = (heightininch / 12);
		heightininch = (heightinfoot % 12);
		System.out.print("Your Height in cm is " + height + " while in feet is " + heightinfoot + " and inches is " + heightininch);
		
		
	}
}
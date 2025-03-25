import java.util.Scanner;
public class KmtoMileConverter {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double miles,kms;
		System.out.print("Kilometers = ");
		kms = input.nextDouble();
		input.close();
		
		miles = kms * 0.621371;
		System.out.printf( "The total miles is %.4f miles for the given %.2f km", miles, kms);
	}
}
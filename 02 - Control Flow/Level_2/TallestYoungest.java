import java.util.Scanner;
public class TallestYoungest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amar's Age : ");
		int age1 = input.nextInt();
		System.out.print("Enter Akbar's Age : ");
		int age2 = input.nextInt();
		System.out.print("Enter Anthony's Age : ");
		int age3 = input.nextInt();
		
		System.out.print("Enter Amar's Height : ");
		double h1 = input.nextDouble();
		System.out.print("Enter Akbar's Height : ");
		double h2 = input.nextDouble();
		System.out.print("Enter Anthony's Height : ");
		double h3 = input.nextDouble();
		
		if (age1 < age2 && age1 < age2) {
			System.out.print("Amar is the Youngest among all. ");
		} else if (age2 < age1 && age2 < age3) {
			System.out.print("Akbar is the Youngest among all. ");
		} else {
			System.out.print("Anthony is the Youngest among all. ");
		}
		if (h1 < h2 && h1 < h3) {
			System.out.print("Amar is the Shortest of All. ");
		} else if (h2 < h1 && h2 < h3) {
			System.out.print("Akbar is the Shortest of All. ");
		} else {
			System.out.println("Anthony is the Shortest of All. ");
		}
	}
}
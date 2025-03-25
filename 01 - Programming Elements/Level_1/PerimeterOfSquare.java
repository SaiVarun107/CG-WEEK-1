import java.util.Scanner;
public class PerimeterOfSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side,perimeter;
		System.out.print("Lenght of Side of Square : ");
		side = input.nextDouble();
		perimeter = 4 * side;
		input.close();
		System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);
	} 
}
import java.util.Scanner;
public class AthleteRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		double side1,side2,side3,perimeter,totalDistance,rounds;

        System.out.print("Enter side 1 (in meters): ");
        side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        side2 = scanner.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        side3 = scanner.nextDouble();

        perimeter = side1 + side2 + side3;
        totalDistance = 5000; 
        rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        scanner.close();
    }
}

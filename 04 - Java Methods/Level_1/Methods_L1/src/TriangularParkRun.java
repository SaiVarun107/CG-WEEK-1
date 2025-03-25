import java.util.Scanner;
public class TriangularParkRun {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) (5000 / perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("Rounds needed: " + rounds);
        scanner.close();
    }
}

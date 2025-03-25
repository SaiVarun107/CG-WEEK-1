import java.util.Scanner;
public class QuadraticEquation {
    public static void findRoots(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two roots: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One root: " + root);} else {
            System.out.println("No real roots.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        findRoots(a, b, c);
        input.close();
    }
}

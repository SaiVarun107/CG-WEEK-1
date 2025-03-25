import java.util.Scanner;
public class TrigonometricFunctions {
    public static void calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        System.out.println("Sin: " + sin);
        System.out.println("Cos: " + cos);
        System.out.println("Tan: " + tan);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        calculateTrigonometricFunctions(angle);
        scanner.close();
    }
}

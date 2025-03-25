import java.util.Scanner;
public class Circle {
    double radius;
    public void setRadius(double r) {
        radius = r;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("\nCircle Details");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        c.setRadius(r);
        c.displayDetails();
        sc.close();
    }
}
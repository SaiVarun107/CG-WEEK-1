import java.util.Scanner;
public class UnitConvertorYards {
    public static double yards2feet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double feet2yards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double meters2inches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double inches2meters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in yards : ");
        double yards = input.nextDouble();
        System.out.print("Yards : " + yards2feet(yards));

        System.out.print("Enter value in feet : ");
        double feet = input.nextDouble();
        System.out.print("Feet : " + feet2yards(feet));

        System.out.print("Enter value in yards : ");
        double meters = input.nextDouble();
        System.out.print("Meters : " + meters2inches(meters));

        System.out.print("Enter value in yards : ");
        double inches = input.nextDouble();
        System.out.print("Inches : " + inches2meters(inches));
        input.close();
    }
}

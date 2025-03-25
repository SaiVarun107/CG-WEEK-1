import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[] heights = new double[numPersons] ;
        double[] weights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            heights[i] = input.nextDouble();
            System.out.print("Enter weight in kg: ");
            weights[i] = input.nextDouble();
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.4 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("\nBMI Results:");
        System.out.println("Person  Height (m)  Weight (kg)  BMIStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), heights[i], weights[i], bmi[i], status[i]);
        }
        input.close();
    }
}

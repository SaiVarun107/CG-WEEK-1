import java.util.Scanner;
public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 40)
            return "Overweight";
        else
            return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter weight (kg) of person " + i + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + i + ": ");
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            System.out.println("Person " + i + " - BMI: " + bmi + " (" + status + ")");
        }
        sc.close();
    }
}

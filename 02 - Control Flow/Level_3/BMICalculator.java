import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        double heightm = heightCm / 100;
        double bmi = weight / (heightm * heightm);
        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        input.close();
    }
}

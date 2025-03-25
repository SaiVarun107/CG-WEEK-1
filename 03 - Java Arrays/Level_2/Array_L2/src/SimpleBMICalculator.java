import java.util.Scanner;
public class SimpleBMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter height in meters: ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Height must be positive. Try again.");
            }
            while (true) {
                System.out.print("Enter weight in kg: ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Weight must be positive. Try again.");
            }
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }}}

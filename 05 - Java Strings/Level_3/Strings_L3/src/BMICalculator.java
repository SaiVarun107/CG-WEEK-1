import java.util.Scanner;
public class BMICalculator {
    public static double[][] getInput(int n) {
        Scanner scanner = new Scanner(System.in);
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Enter weight in kg: ");
            hw[i][0] = scanner.nextDouble();
            System.out.print("Enter height in cm: ");
            hw[i][1] = scanner.nextDouble();

            System.out.println();
        }
        return hw;
    }
    public static String[] getBMIandStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        String bmiString = String.format("%.2f", bmi);
        return new String[]{bmiString, status};
    }
    public static String[][] prepareResult(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double height = hw[i][1];
            String[] bmiStatus = getBMIandStatus(weight, height);
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmiStatus[0];
            result[i][3] = bmiStatus[1];
        }
        return result;
    }
    public static void display(String[][] data) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t\t" + data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" + data[i][2] + "\t" + data[i][3]);
        }
    }
    public static void main(String[] args) {
        int totalPersons = 10;
        double[][] heightWeightData = getInput(totalPersons);
        String[][] finalData = prepareResult(heightWeightData);
        display(finalData);
    }
}

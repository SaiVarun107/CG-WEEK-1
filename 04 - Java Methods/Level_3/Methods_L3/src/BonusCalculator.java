import java.util.Random;
public class BonusCalculator {
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        Random rand = new Random();
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 30000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] updatedData = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            double salary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updatedData[i][0] = bonus;
            updatedData[i][1] = newSalary;
        }
        return updatedData;
    }
    public static void displaySummary(double[][] originalData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Emp ID", "Old Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < originalData.length; i++) {
            double oldSalary = originalData[i][0];
            int years = (int) originalData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];
            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            System.out.printf("%-10d%-15.2f%-15d%-15.2f%-15.2f\n", (i + 1), oldSalary, years, bonus, newSalary);
        }
        System.out.println("__________________________________________________________________");
        System.out.printf("%-10s%-15.2f%-15s%-15.2f%-15.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }
}

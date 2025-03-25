import java.util.Scanner;
public class EmployeeBonusSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonusAmount = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter salary for Employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();
            System.out.println("Enter years of service for Employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonusAmount[i] +
                    " | New Salary: " + newSalary[i]);
        }
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}

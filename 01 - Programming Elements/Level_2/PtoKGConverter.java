import java.util.Scanner;

public class PtoKGConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double weightInPounds,weightInKg;

        System.out.print("Enter the weight in pounds: ");
        weightInPounds = input.nextDouble();
        weightInKg = weightInPounds / 2.2; 

        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKg);
        input.close();
    }
}

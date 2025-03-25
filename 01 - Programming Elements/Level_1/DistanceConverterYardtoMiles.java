import java.util.Scanner;

public class DistanceConverterYardtoMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet, distanceInYards, distanceInMiles;
        
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();
        
        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;
        
        System.out.printf("The distance is %.2f yards and %.4f miles", distanceInYards, distanceInMiles);
        
        input.close();
    }
}

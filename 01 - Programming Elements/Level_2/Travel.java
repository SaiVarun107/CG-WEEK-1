import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in kms): ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in kms): ");
        double distanceViaToFinal = scanner.nextDouble();

        System.out.print("Enter hours taken from " + fromCity + " to " + viaCity + ": ");
        int hours1 = scanner.nextInt();

        System.out.print("Enter minutes taken from " + fromCity + " to " + viaCity + ": ");
        int mins1 = scanner.nextInt();

        System.out.print("Enter hours taken from " + viaCity + " to " + toCity + ": ");
        int hours2 = scanner.nextInt();

        System.out.print("Enter minutes taken from " + viaCity + " to " + toCity + ": ");
        int mins2 = scanner.nextInt();

        double totalDistanceMiles = distanceFromToVia + distanceViaToFinal;
        double totalDistanceKm = totalDistanceMiles * 1.60934;
        int totalHours = hours1 + hours2 + (mins1 + mins2) / 60;
        int totalMinutes = (mins1 + mins2) % 60;

        System.out.println("Travel Summary for " + name + ":");
        System.out.println("Route: " + fromCity + " →- " + viaCity + " - " + toCity);
        System.out.println("Total Distance: " + totalDistanceMiles + " miles (" + totalDistanceKm + " km)");
        System.out.println("Total Time: " + totalHours + " Hours " + totalMinutes + " Minutes");

        scanner.close();
    }
}

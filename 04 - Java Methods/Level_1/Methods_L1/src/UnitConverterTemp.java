import java.util.Scanner;

public class UnitConverterTemp {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = scanner.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(f));
        System.out.print("Enter Celsius: ");
        double c = scanner.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(c));
        System.out.print("Enter Pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.print("Enter Kilograms: ");
        double kg = scanner.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kg));
        System.out.print("Enter Gallons: ");
        double gallons = scanner.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));
        System.out.print("Enter Liters: ");
        double liters = scanner.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));
        scanner.close();
    }
}

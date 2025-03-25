import java.util.Scanner;
public class WindChillCalculator {
    public static double WindCalculator (double temp, double windspeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windspeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature in Fahrenheit : ");
        double temp = input.nextDouble();
        System.out.print("Enter the Wind Speed : ");
        double windspeed = input.nextDouble();
        double windChill = WindCalculator(temp, windspeed);
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }
}

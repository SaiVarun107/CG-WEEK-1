  
import java.util.Scanner;
public class TemperatureFtoC {
    public static void main(String[] args) {
        double Celsius,Fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.print("Fahrenheit = ");
		Fahrenheit = input.nextDouble();
		input.close();
		Celsius = ((Fahrenheit - 32) * (5.0/9.0));
		System.out.printf("The %.3f Fahrenheit is %.3f celsius",Fahrenheit,Celsius);
    }
}

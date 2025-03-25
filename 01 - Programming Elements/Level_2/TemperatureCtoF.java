  
import java.util.Scanner;
public class TemperatureCtoF {
    public static void main(String[] args) {
        double Celsius,Fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.print("Celsius = ");
		Celsius = input.nextDouble();
		input.close();
		Fahrenheit = (Celsius * (9/5)) + 32;
		System.out.printf("The %.3f Celsius is %.3f fahrenheit",Celsius,Fahrenheit);
    }
}

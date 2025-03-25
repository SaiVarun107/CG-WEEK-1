import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Positive Integer: ");
        int number = input.nextInt();
        
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int greatestFactor = 1;
            
            for (int i = number - 1; i >= 1; i--) {  
                if (number % i == 0) {  
                    greatestFactor = i;  
                    break;  
                }
            }
            
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        
        input.close();
    }
}

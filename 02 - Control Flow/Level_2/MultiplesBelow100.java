import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Positive Integer (less than 100): ");
        int number = input.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a number greater than 0 and less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.print(i + ",");
                }
            }
        }
        
        input.close();
    }
}

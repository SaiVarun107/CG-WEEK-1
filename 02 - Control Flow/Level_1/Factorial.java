import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        int fact = 1, i = n;

        while (i > 0) {
            fact = fact * i; i--;
        }
        System.out.println("Factorial: " + fact);
        input.close();
    } 
}

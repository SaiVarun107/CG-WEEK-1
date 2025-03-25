import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num, sum = 0;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
        input.close();
    }
}

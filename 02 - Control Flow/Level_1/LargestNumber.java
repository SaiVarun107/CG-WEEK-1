import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int num1,num2,num3;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        boolean largest1 = (num1 > num2) && (num1 > num3);
        System.out.println("Is the first number the largest? " + largest1);
        boolean largest2 = (num2 > num1) && (num2 > num3);
        System.out.println("Is the first number the largest? " + largest2);
		boolean largest3 = (num3 > num1) && (num3 > num2);
        System.out.println("Is the first number the largest? " + largest3);
		
        input.close();
    }
}

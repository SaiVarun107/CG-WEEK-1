import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num = num / 10;
        }
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        input.close();
    }
}

import java.util.Scanner;
public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();
        if (number <= 0 && number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            int count = 99; 
            while (count > 0) {
                if (count % number == 0) {
                    System.out.print( count + ",");
                }
                count--;
            }
        }
        input.close();
    }
}

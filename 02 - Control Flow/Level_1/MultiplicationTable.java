import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int[] Table = new int[10];
        for (int i = 0; i < 10; i++) {
            Table[i] = num * (i+1);
        }
        System.out.println("Mulpication Table of " + num + " is :");
        for(int i = 1; i <= 10; i++) {
            System.out.println( num + " * " + (i+1) + " = " + Table[i]);
        }
        input.close();
    }
}

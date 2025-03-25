import java.util.Scanner;
public class NumberNature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the Number" + (i+1) + " : ");
            num[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (num[i]<0){
                System.out.println("Number is Negative.");
            } else if (num[i] == 0){
                System.out.println("Number is Zero.");
            } else {
                System.out.println("Number " + num[i] + " is Positive.");
            }
            if(num[i]%2 == 0){
                System.out.println("The Number " + num[i] + " is Even.");
            } else {
                System.out.println("The Number " + num[i] + " -1is Odd.");
            }
        }
        if(num[0] > num[4]) {
            System.out.println("First Number is Greater than Last Number.");
        } else if(num[0] == num[4]) {
            System.out.println("First Number is Equal to Last Number.");
        } else {
            System.out.println("First Number is Less than Last Number.");
        }
        input.close();
    }
}

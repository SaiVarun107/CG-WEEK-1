import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.println("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }
        int youngestIndex = 0;
        double tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[(int)tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[(int)tallestIndex] + " with height " + heights[(int)tallestIndex] + " cm");
        input.close();
    }
}

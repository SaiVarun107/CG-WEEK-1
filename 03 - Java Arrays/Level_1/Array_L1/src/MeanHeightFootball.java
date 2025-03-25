import java.util.Scanner;
public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double totalHeight = 0.0;

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = input.nextDouble();
            totalHeight += heights[i];
        }
        double meanHeight = totalHeight / 11;
        System.out.println("Mean height of the football team: " + meanHeight + " cm");

        input.close();
    }
}

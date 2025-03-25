import java.util.Scanner;
public class YoungestAndTallest {
    public static int findYoungest(int[] ages) {
        int temp1 = 0;
        if (ages[1] < ages[temp1]) {
            temp1 = 1;
        }
        if (ages[2] < ages[temp1]) {
            temp1 = 2;
        }
        return temp1;
    }
    public static int findTallest(double[] heights) {
        int temp2 = 0;
        if (heights[1] > heights[temp2]) {
            temp2 = 1;
        }
        if (heights[2] > heights[temp2]) {
            temp2 = 2;
        }
        return temp2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        System.out.println();
        System.out.println("The youngest friend is: " + names[youngest]);
        System.out.println("The tallest friend is: " + names[tallest]);
        scanner.close();
    }
}

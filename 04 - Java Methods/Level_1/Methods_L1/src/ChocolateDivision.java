import java.util.Scanner;
public class ChocolateDivision {
    public static void findChocolateDistribution(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.println("Each child gets: " + chocolatesPerChild + " chocolates");
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren > 0) {
            findChocolateDistribution(numberOfChocolates, numberOfChildren);
        } else {
            System.out.println("Number of children must be greater than zero.");
        }
        scanner.close();
    }
}

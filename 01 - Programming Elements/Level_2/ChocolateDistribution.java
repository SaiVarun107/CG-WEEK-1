import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int noChocolates,noChildren,remainingChocolates,chocolatesPerChild;
        System.out.print("Enter the total number of chocolates: ");
        noChocolates = scanner.nextInt();

        System.out.print("Enter the total number of children: ");
        noChildren = scanner.nextInt();

        chocolatesPerChild = noChocolates / noChildren;
        remainingChocolates = noChocolates % noChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates + ".");

        scanner.close();
    }
}

import java.util.Scanner;
public class EuclideanDistance {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
    }
    public static double[] getLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates for two points (x1 y1 x2 y2):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = getDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);
        double[] equation = getLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + equation[0] + "x + " + equation[1]);
    }
}

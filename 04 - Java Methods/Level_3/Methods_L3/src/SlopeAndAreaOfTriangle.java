import java.util.Scanner;
public class SlopeAndAreaOfTriangle {
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slope1 = (double)(y2 - y1) / (x2 - x1);
        double slope2 = (double)(y3 - y2) / (x3 - x2);
        return slope1 == slope2;
    }
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of 3 points (x1 y1 x2 y2 x3 y3):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + slopeCheck);
        System.out.println("Collinear by Area Method: " + areaCheck);
    }
}

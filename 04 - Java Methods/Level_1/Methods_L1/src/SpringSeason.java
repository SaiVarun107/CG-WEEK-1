import java.util.Scanner;
public class SpringSeason {
    public static boolean isSpringSeason(String month, int day) {
        if (month.equals("march") && day >= 20) {
            return true;
        } else if (month.equals("april") || month.equals("may")) {
            return true;
        } else if (month.equals("june") && day <= 20) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month : ");
        String month = scanner.next().toLowerCase();
        System.out.print("Enter day : ");
        int day = scanner.nextInt();
        if (isSpringSeason(month, day)) {
            System.out.println("it's a spring season");
        } else {
            System.out.println("not a spring season");
        }
        scanner.close();
    }
}

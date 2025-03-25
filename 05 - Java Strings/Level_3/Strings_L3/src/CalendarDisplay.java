import java.util.Scanner;
public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        int startDay = getStartDay(month, year);
        int days = daysInMonth[month - 1];
        System.out.println();
        System.out.println("      " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static int getStartDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d = (1 + x + (31 * m0) / 12) % 7;
        return d;
    }
}
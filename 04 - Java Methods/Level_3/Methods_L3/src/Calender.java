import java.util.Scanner;
public class Calendar {
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int year, int month) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month - 1];
        }
    }
    public static int getFirstDay(int year, int month) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int k = year % 100;
        int j = year / 100;
        int day = (1 + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (day + 6) % 7;
    }
    public static void printCalendar(int year, int month) {
        String monthName = getMonthName(month);
        int totalDays = getDaysInMonth(year, month);
        int startDay = getFirstDay(year, month);
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= totalDays; day++) {
            if (day < 10) {
                System.out.print("  " + day + " ");
            } else {
                System.out.print(" " + day + " ");
            }
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month (1 to 12): ");
        int month = input.nextInt();
        printCalendar(year, month);
    }
}

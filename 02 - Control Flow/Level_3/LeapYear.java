import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = input.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                if (year % 100 == 0) {
                    System.out.println(year + " is NOT a Leap Year.");
                } else {
                    if (year % 4 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                }
            }
        } else {
            System.out.println("The Leap Year program works only for years from 1582 onwards.");
        }
        input.close();
    }
}

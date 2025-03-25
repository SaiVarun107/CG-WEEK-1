import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] characters = input.toCharArray();
        int count = 0;
        for (char c : characters) {
            count++;
        }
        System.out.println("Length of the string: " + count);
        sc.close();
    }
}
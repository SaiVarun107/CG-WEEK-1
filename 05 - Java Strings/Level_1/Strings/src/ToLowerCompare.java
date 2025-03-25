import java.util.Scanner;
public class ToLowerCompare {
    public static String toLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
    public static boolean compare(String a, String b) {
        return a.equals(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String manual = toLower(input);
        String builtIn = input.toLowerCase();
        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Are equal? " + compare(manual, builtIn));
    }
}

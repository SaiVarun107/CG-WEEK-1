import java.util.Scanner;
public class StringCompare {
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.next();
        System.out.print("Enter second string: ");
        String str2 = input.next();
        boolean result1 = compareWithCharAt(str1, str2);
        boolean result2 = str1.equals(str2);
        System.out.println("Comparison using charAt(): " + result1);
        System.out.println("Comparison using equals(): " + result2);
        if (result1 == result2) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
        input.close();
    }
}
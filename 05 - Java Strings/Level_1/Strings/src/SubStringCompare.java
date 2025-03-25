import java.util.Scanner;

public class SubStringCompare {
    public static String createSubstringWithCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String substring1 = createSubstringWithCharAt(input, start, end);
        String substring2 = input.substring(start, end);
        boolean areEqual = compareWithCharAt(substring1, substring2);
        System.out.println("Substring using charAt(): " + substring1);
        System.out.println("Substring using substring(): " + substring2);
        System.out.println("Are both substrings equal? " + areEqual);
        sc.close();
    }
}
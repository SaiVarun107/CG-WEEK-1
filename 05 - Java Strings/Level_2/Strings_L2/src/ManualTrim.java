import java.util.Scanner;
public class ManualTrim {
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = length - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
        return new int[]{start, end};
    }
    public static String getSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String input = sc.nextLine();
        int[] indices = findTrimIndices(input);
        String manualTrimmed = getSubstring(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();
        boolean same = compareStrings(manualTrimmed, builtInTrimmed);
        System.out.println("\nManually Trimmed: '" + manualTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both equal? " + same);
        sc.close();
    }
}

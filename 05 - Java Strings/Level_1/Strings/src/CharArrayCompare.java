import java.util.Scanner;
public class CharArrayCompare {
    public static char[] userDefinedToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] customArray = userDefinedToCharArray(input);
        char[] builtInArray = input.toCharArray();
        boolean isEqual = compareCharArrays(customArray, builtInArray);
        System.out.print("Characters using user-defined method: ");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }
        System.out.println("\nAre both arrays equal? " + isEqual);
        sc.close();
    }
}

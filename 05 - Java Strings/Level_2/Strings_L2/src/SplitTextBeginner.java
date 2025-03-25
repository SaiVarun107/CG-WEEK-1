import java.util.Scanner;
public class SplitTextBeginner {
    public static int getLength(String text) {
        int count = 0;
        for (char ch : text.toCharArray()) {
            count++;
        }
        return count;
    }
    public static String[] splitWordsManual(String text) {
        int length = getLength(text);
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }
        String[] words = new String[spaces + 1];
        String word = "";
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                words[index] = word;
                index++;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }
    public static boolean areArraysSame(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] manual = splitWordsManual(input);
        String[] builtin = input.split(" ");
        System.out.println("Manual Split Words:");
        for (int i = 0; i < manual.length; i++) {
            System.out.println(manual[i]);
        }
        System.out.println("Built-in Split Words:");
        for (int i = 0; i < builtin.length; i++) {
            System.out.println(builtin[i]);
        }
        boolean same = areArraysSame(manual, builtin);
        System.out.println("Are both results same? " + same);
        sc.close();
    }
}

import java.util.Scanner;
public class FrequencyOfUniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = ch;
            }
        }
        System.out.println("Unique Characters and Frequencies:");
        for (int i = 0; i < uniqueCount; i++) {
            char ch = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + " = " + count);
        }
    }
}

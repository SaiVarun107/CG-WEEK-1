import java.util.Scanner;
public class WordLengthTable {
    public static String[] splitWords(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
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
    public static int getWordLength(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            count++;
        }
        return count;
    }
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int length = getWordLength(words[i]);
            result[i][1] = String.valueOf(length);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] wordWithLengths = getWordsWithLengths(words);
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (int i = 0; i < wordWithLengths.length; i++) {
            String word = wordWithLengths[i][0];
            int length = Integer.parseInt(wordWithLengths[i][1]);
            System.out.println(word + "\t" + length);
        }
        sc.close();
    }
}

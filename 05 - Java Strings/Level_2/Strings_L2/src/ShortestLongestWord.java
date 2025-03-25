import java.util.Scanner;
public class ShortestLongestWord {
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
    public static int getLength(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            count++;
        }
        return count;
    }
    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = getLength(words[i]);
            result[i][1] = String.valueOf(len);
        }
        return result;
    }
    public static int[] findShortestAndLongest(String[][] wordData) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);
            int shortest = Integer.parseInt(wordData[shortestIndex][1]);
            int longest = Integer.parseInt(wordData[longestIndex][1]);
            if (currentLength < shortest) {
                shortestIndex = i;
            }
            if (currentLength > longest) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordTable = getWordLengthTable(words);
        int[] result = findShortestAndLongest(wordTable);
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordTable.length; i++) {
            System.out.println(wordTable[i][0] + "\t" + wordTable[i][1]);
        }
        String shortestWord = wordTable[result[0]][0];
        String longestWord = wordTable[result[1]][0];
        System.out.println("\nShortest Word: " + shortestWord);
        System.out.println("Longest Word : " + longestWord);
        sc.close();
    }
}
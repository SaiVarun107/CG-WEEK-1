import java.util.Scanner;
public class CharTypeTable {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // convert to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] getCharTypes(String text) {
        int len = text.length();
        String[][] table = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = checkCharType(ch);
        }
        return table;
    }
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println("   " + table[i][0] + "\t\t" + table[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] resultTable = getCharTypes(input);
        displayTable(resultTable);
        sc.close();
    }
}
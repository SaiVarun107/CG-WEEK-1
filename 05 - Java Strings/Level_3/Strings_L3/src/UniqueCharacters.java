import java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }
        System.out.println("Unique characters: " + unique);
    }
}

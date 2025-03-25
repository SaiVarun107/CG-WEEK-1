import java.util.Scanner;
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}

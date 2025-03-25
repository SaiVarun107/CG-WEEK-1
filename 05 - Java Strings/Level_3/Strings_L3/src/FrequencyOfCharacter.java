import java.util.Scanner;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " = " + freq[i]);
            }
        }
    }
}

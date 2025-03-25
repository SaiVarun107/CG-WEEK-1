import java.util.Scanner;
public class FrequencyUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int len = text.length();
        int[] freq = new int[len];
        char[] ch = new char[len];
        for (int i = 0; i < len; i++) {
            ch[i] = text.charAt(i);
            freq[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (ch[i] == ch[j] && ch[i] != '0') {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < len; i++) {
            if (ch[i] != '0') {
                System.out.println(ch[i] + " = " + freq[i]);
            }
        }
    }
}
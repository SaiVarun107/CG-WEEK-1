import java.util.Scanner;
public class StringCase {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = input.nextLine();
        String result = "";
        for(int i = 0 ; i < name.length(); i++){
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.print("The Name after Case Changed is " + result);
        input.close();

    }
}

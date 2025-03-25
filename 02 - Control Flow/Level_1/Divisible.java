import java.util.Scanner;
public class Divisible{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		int num1;
		System.out.print(" Enter the Number = ");
		num1 = input.nextInt();
		
		if (num1%5 == 0) {
		   System.out.println("YES");
		} else {
		   System.out.println("NO");
		}
		input.close();
		
	}
}
    